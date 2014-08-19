#javier riveros
#Start and Stop pic services


case $1 in

"start" )
	echo "starting Pic Services"
	sudo screen -dmS PIC /var/lib/jvm/jdk1.6.0_45/bin/java -jar asterisk-java-1.0.0.M3.jar		 
	
;;
"stop" )
	echo "Stoping Pic Services"
	for i in `sudo screen -list | grep PIC| awk '{print $1}'`; do sudo screen -X -S $i quit; done
;;

esac



