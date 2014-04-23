<?php
$sip = "/etc/asterisk/extensions_peers.conf";
$fh = fopen($sip, 'w');

$connA = pg_pconnect("host=172.16.40.14 dbname=callcenter user=dbuser01 password=toor2013!");
if (!$connA) {
  echo "Failed connecting to postgres database $database\n";
  exit;
}

$res_sip = pg_query( $connA, "SELECT * FROM groups ");

$data = "";
$data .= "\n";
$data .= "[ctx-agents] \n";

while($row_sip = pg_fetch_object($res_sip)) 
{
        $loginid = trim($row_sip->loginID);
        $logoutid = trim($row_sip->logoutID);
	$name = trim($row_sip->name); 
	
	$data .= "exten =>".$loginid.",1,Answer() \n";
	$data .= "exten =>".$loginid.",n,Set(AGENT_NUMBER=\${CALLERID(NUM)}) \n";
	$data .= "exten =>".$loginid.",n,Goto(queues-login-".$name.",I\${AGENT_NUMBER},1) \n";
	$data .= "exten =>".$loginid.",n,Hangup \n"; 
	$data .= "exten =>".$logoutid.",1,Set(AGENT_NUMBER=\${CALLERID(NUM)}) \n";
	$data .= "exten =>".$logoutid.",n,Macro(queue-addremove,".$name.",10,O\${AGENT_NUMBER}) \n"; 
        $data .= "exten =>".$logoutid.",n,Playback(agent-loggedoff) \n"; 
	$data .= "exten =>".$logoutid.",n,Hangup \n";
}

$data .= "\n";

$res_sip = pg_query($connA,"SELECT * FROM groups  "  );
while($row_sip = pg_fetch_object($res_sip)) 
{ 
	$name = trim($row_sip->name); 
	
	$data .= "[queues-login-".$name."] \n";
	$data .= "exten => _[IO]X.,1,Macro(queue-addremove,".$name.",\${penality},\${EXTEN}) \n";
	$data .= "exten => _[IO]X.,n,Playback(agent-loginok);macro(queue-success(${EXTEN}) \n"; 
}
$data .= "\n";
$data .= "[macro-queue-addremove] \n";
$data .= "exten => s,1,Set(queuename=\${ARG1}) \n";
$data .= "exten => s,n,Set(penalty=\${ARG2}) \n";
$data .= "exten => s,n,Set(exten=\${ARG3}) \n";
$data .= "exten => s,n,goto(\${exten:0:1}) \n";  
$data .= "exten => s,n,Playback(invalid) \n";
$data .= "exten => s,n,MacroExit \n";
$data .= "exten => s,n(I),AddQueueMember(\${queuename},SIP/\${exten:1},\${penalty}) \n";
$data .= "exten => s,n,MacroExit \n";
$data .= "exten => s,n(O),RemoveQueueMember(\${queuename},SIP/\${exten:1}) \n";
$data .= "exten => s,n,MacroExit \n";  
$data .= "exten => s,n(P),PauseQueueMember(\${queuename},SIP/\${exten:1}) \n";
$data .= "exten => s,n,MacroExit \n"; 
$data .= "exten => s,n(U),UnpauseQueueMember(\${queuename},SIP/\${exten:1}) \n";
$data .= "exten => s,n,MacroExit \n"; 

$res_sip = pg_query($connA, "SELECT * FROM groups ");
$data .= "\n";
$data .= "[call-queues] \n";
while($row_sip = pg_fetch_object($res_sip)) 
{
$name = trim($row_sip->name); 

$data .= "exten => ".$name.",1,Playback(pls-hold-trans-custsrv) \n";
$data .= "exten => ".$name.",n,Answer() \n";
$data .= "exten => ".$name.",n,Ringing() \n";
$data .= "exten => ".$name.",n,Wait(2) \n";  
$data .= "exten => ".$name.",n,Queue(".$name.",twhn) \n";
$data .= "exten => ".$name.",n,Hangup(16) \n"; 
}

fwrite($fh, $data);
fclose($fh);

 require_once("/var/lib/asterisk/agi-bin/phpagi/phpagi-asmanager.php");

 $asm = new AGI_AsteriskManager();
 if($asm->connect("127.0.0.1", "astmgr01", "FWRWFN0P2H4K2H1UL41I"))
 {
         $peer = $asm->command("dialplan reload");
         $asm->disconnect();
 }
?>

 
