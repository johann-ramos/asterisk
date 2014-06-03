#!/bin/bash		
		cd
		cd var/lib/asterisk/agi-bin/callcenter/


		echo "****************************************************"
		echo "***********Excute Presence screen*******************"
		echo "****************************************************"
		sudo screen -dmS Presence java -cp lib/asterisk-java-1.0.0.M3.jar:lib/postgresql-9.1-903.jdbc4.jar:. com.capanicus.callcenter.PresenceMonitor
		sleep 3

		
		echo "****************************************************"
		echo "***********Excute Billing screen*******************"
		echo "****************************************************"
		sudo screen -dmS Billing java -cp lib/asterisk-java-1.0.0.M3.jar:lib/postgresql-9.1-903.jdbc4.jar:. com.capanicus.callcenter.LiveCallsMonitor
		sleep 3

		
		echo "****************************************************"
		echo "***********Excute AGI screen*******************"
		echo "****************************************************"
		sudo screen -dmS AGI java -cp lib/asterisk-java-1.0.0.M3.jar:lib/postgresql-9.1-903.jdbc4.jar:fastagi-mapping.properties:. -Xms1000m -Xmx1000m org.asteriskjava.fastagi.DefaultAgiServer
		sleep 3

		echo "****************************************************"
		echo "******************View all screen*******************"
		echo "****************************************************"
		sudo screen -list
