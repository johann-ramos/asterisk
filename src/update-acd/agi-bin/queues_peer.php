<?php
$sip = "/etc/asterisk/queues_peers.conf";
$fh = fopen($sip, 'w');

$connA = mysql_connect("172.16.40.14","dbuser01",'toor2013!');
mysql_select_db("callcenter", $connA);

$res_sip = mysql_query("SELECT * FROM groups WHERE groupType LIKE 'A' ", $connA);

$data = "";
$data .= "\n";
 
while($row_sip = mysql_fetch_object($res_sip))
{ 
$data .= "\n";
$name = $row_sip->name;  
$data .= "[".$name."] \n";
$data .= "music=music \n";
$data .= "eventwhencalled=yes \n"; 
$data .= "strategy=ringall \n"; 
$data .= "timeout=600 \n"; 
$data .= "retry=1 \n"; 
$data .= "wrapuptime=0 \n"; 
$data .= "maxlen=0 \n"; 
$data .= "ringinuse=no \n"; 
$data .= "announce-frequency=60 \n"; 
$data .= "announce-holdtime=60 \n"; 
$data .= "monitor-type=MixMonitor \n"; 
$data .= "monitor-format=wav \n"; 
$data .= "monitor-join=yes \n"; 
$data .= "periodic-announce=queue-periodic-announce \n";
}
fwrite($fh, $data);
fclose($fh);

//require_once("/var/lib/asterisk/agi-bin/phpagi/phpagi-asmanager.php");  
//$asm = new AGI_AsteriskManager();
//if($asm->connect("127.0.0.1", "astmgr01", "FWRWFN0P2H4K2H1UL41I"))
//{
//        $peer = $asm->command("queue reload all");
//        $asm->disconnect();
//}
?>
