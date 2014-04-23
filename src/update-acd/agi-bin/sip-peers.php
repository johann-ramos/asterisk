<?php
$sip = "/etc/asterisk/sip_peers.conf";
$fh = fopen($sip, 'w');

$connA = pg_pconnect("host=172.16.40.14 port=xxxx dbname=callcenter user=dbuser01 password=toor2013!");
if (!$connA) {
  echo "Failed connecting to postgres database $database\n";
  exit;
}

$res_sip = pg_query( $connA, "SELECT * FROM agents ");

$data = "";

while($row_sip = pg_fetch_object($res_sip)) 
{
	$id = trim($row_sip->agentid);
	$name = trim($row_sip->username); 
	$password = trim($row_sip->password);
	$context = trim($row_sip->context); 
	$phone = trim($row_sip->phone);

	if($id > 0) 
	{
		$data .= "\n";
		$data .= "[$name]\n";
		$data .= "type=friend\n";
		$data .= "accountcode=$name\n"; 
		$data .= "defaultuser=$name\n";
		$data .= "callerid=$phone\n";
		$data .= "secret=$password\n";
		$data .= "host=dynamic\n";
		$data .= "context=$context\n";
		$data .= "insecure=invite\n";
		$data .= "disallow=all\n";
		$data .= "allow=g729\n";
		$data .= "allow=ulaw\n"; 
	}
}


$res_sip = pg_query( $connA, "SELECT * FROM admins ");

//$data = "";

while($row_sip = pg_fetch_object($res_sip)) 
{ 
	$name = trim($row_sip->sipusername); 
	$password = trim($row_sip->password);
	$context = trim($row_sip->context); 
	$phone = trim($row_sip->phone);

	if($id > 0) 
	{
		$data .= "\n";
		$data .= "[$name]\n";
		$data .= "type=friend\n";
		$data .= "accountcode=$name\n"; 
		$data .= "defaultuser=$name\n";
		$data .= "callerid=$phone\n";
		$data .= "secret=$password\n";
		$data .= "host=dynamic\n";
		$data .= "context=$context\n";
		$data .= "insecure=invite\n";
		$data .= "disallow=all\n";
		$data .= "allow=g729\n";
		$data .= "allow=ulaw\n"; 
	}
}


fwrite($fh, $data);
fclose($fh);

 require_once("/var/lib/asterisk/agi-bin/phpagi/phpagi-asmanager.php");

 $asm = new AGI_AsteriskManager();
 if($asm->connect("127.0.0.1", "astmgr01", "FWRWFN0P2H4K2H1UL41I"))
 {
         $peer = $asm->command("sip reload");
         $asm->disconnect();
 }
?>
