#!/bin/bash

########################################################
# Script creado por Enrique Fermin
# email: enrique.fermin.n@gmail.com
# Fecha de creacion 14 de Abril de 2014
# Registrado bajo licencia GPL Version 2
# Este script instala y desintala asterisk 
# para la plataforma MPSANP de CANTV. 
# Parametros de entrada:
# 1.- install , unistall
# 2.- desarrollo , calidad , produccion
# 3.- ivr , acd , asr
# IMPORTANTE: Se debe correr con un usuario no root 
# que tenga permisologia de sudo. NO DEBE CORRER COMO ROOT.
#
#
#
# Actualizaciones:
# 21April2014: Se Agrego la actualizacion de cola cuando es un ACD
# 22April2014: Se modifico para borrar los modulos de lib64 o lib de usr
#
#
#
##############################################################


PATH=$PATH:/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin


#Section Variable decaration######
group=''
ambient=''
type=''
option=''
home_directory=''
install_directory=''
SSL=''
##################################



#section for dependences###########
packages_snmp="snmp libsnmp-dev snmpd unixodbc unixodbc-dev"
packages_essential="build-essential linux-headers-`uname -r` libxml2-dev libncurses5-dev libgtk2.0-dev libnewt0.52 libnewt-dev libsqlite3-dev"
packages_postgresql="postgresql-client libpq-dev php5 php5-pgsql uuid uuid-dev"
###################################

group=`groups $USER | awk -F": " '{print $2}'`
install_directory=`pwd`
echo "Install Directory: " $install_directory
echo "The current user is: " $USER
echo "The current group is: " $group

option=$1
ambient=$2
type=$3
SSL=$4

if [ -z "$option" ];then
	echo "You must provide one parameter for action install|unistall"
	exit 0
fi

if [ -z "$ambient" ];then
	echo "You must provide one parameter for schema desarrollo|calidad|produccion"
	exit 0
fi

if [ -z "$type" ];then
	echo "You must provide one parameter for type ivr|acd|asr"
	exit 0
fi


echo "Begin to install"

#Case for determinate ambient
case $ambient in

"desarrollo" )
	home_directory="/dcantv"
	echo "estoy en desarrollo"
;;
"calidad" )
	echo "estoy en calidad"
	home_directory="/tcantv"
;;

"produccion" )
	echo "estoy en producccion"
	home_directory="/pcantv"
;;
esac




#Case for determinate option of install or unistall
case $option in

"install" )
	cd $home_directory
	sudo chown -R $USER.$group *
	sudo apt-get update
	echo "INSTALING PACKAGES SNMP"
	sudo apt-get -y install $packages_snmp
	echo "INSTALING PACKAGES ESSENTIALS"
	sudo apt-get -y install $packages_essential
	echo "INSTALING PACKAGES POSTGRESQL"
        sudo apt-get -y install $packages_postgresql
	
	


	cd $home_directory/$USER
	mkdir src
	cd src/
	cp $install_directory/src/libhoard-3.9.tar.gz .
	tar zxvf libhoard-3.9.tar.gz
	cd emeryberger-Hoard-d065953/src/
	sudo make linux-gcc-x86-64

	sudo /etc/init.d/snmpd stop
	sudo /etc/snmp/snmpd.conf /etc/snmp/snmpd.conf.ori
	sudo cp $install_directory/src/snmp/snmpd.conf /etc/snmp/snmpd.conf
	sudo /etc/init.d/snmpd start

	snmpwalk -v1 127.0.0.1 -c C0mcantvc0r .1.3.6.1.2.1.25.2.3.1.3

	sleep 10

	cd $home_directory/$USER/src/
	cp $install_directory/src/asterisk-11-current.tar.gz .
	tar xvzf asterisk-11-current.tar.gz
	cd asterisk-11.4.0

	if [ "$SSL" == "ssl" ];
	then
		echo "*****************************************************************"
        echo "*********************Configure whit ssl**************************"
        echo "*****************************************************************"
        sleep 5
		sudo ./configure CFLAGS=-mtune=native --libdir=/usr/lib64 -with-hoard=$home_directory/$USER/src/emeryberger-Hoard-d065953/src/
	else
		echo "*****************************************************************"
		echo "******************Configure whitout ssl**************************"
		echo "*****************************************************************"
		sleep 5
		sudo ./configure CFLAGS=-mtune=native --libdir=/usr/lib64 --disable-asteriskssl -with-hoard=$home_directory/$USER/src/emeryberger-Hoard-d065953/src/
	fi

	cp $home_directory/$USER/src/menuselect/* .
	sudo make
	sudo make all
	sudo make install
	sudo make samples
	sudo make config
	sudo make install-logrotate


	sudo /etc/init.d/asterisk start
	sleep 10
	if [ -f "/var/run/asterisk/asterisk.pid" ];
	then
		echo "***************************************"
		echo "********Asterisk install succefful*****"
		echo "***************************************"
		sudo /etc/init.d/asterisk stop
	else
		echo "***************************************"
		echo "ALERT: Asterisk instalation no succefull"
		echo "***************************************"
	fi
	

	echo "***************************************"
	echo "********Second Lap*********************"
	echo "***************************************"
	

	cd $home_directory/$USER
	mkdir etc
	cd etc
	sudo cp -R /etc/asterisk .
	sudo mv /etc/asterisk /etc/asterisk.old

	echo "Create link symbolic /etc/asterisk"
	sudo ln -s $home_directory/$USER/etc/asterisk /etc/asterisk
	sleep 5


	
	
	cd $home_directory/$USER
	mkdir -p var/lib
	cd var/lib
	sudo cp -R /var/lib/asterisk .
	sudo mv /var/lib/asterisk /var/lib/asterisk.old
	sleep 5

	echo "Create link symbolic /var/lib/asterisk"
	sudo ln -s $home_directory/$USER/var/lib/asterisk /var/lib/asterisk


	cd $home_directory/$USER
	mkdir -p var/spool
	cd var/spool
	sudo cp -R /var/spool/asterisk .
	sudo mv /var/spool/asterisk /var/spool/asteisk.old
	sleep 5

	echo "Create link symbolic /var/spool/asterisk"
	sudo ln -s $home_directory/$USER/var/spool/asterisk /var/spool/asterisk

	cd $home_directory/$USER
	mkdir -p var/run
	cd var/run
	sudo cp -R /var/run/asterisk .
	sudo mv /var/run/asterisk /var/run/asteisk.old
	sleep 5

	echo "Create link symbolic var/run/asterisk"
	sudo ln -s $home_directory/$USER/var/run/asterisk /var/run/asterisk

	cd $home_directory/$USER
	mkdir -p usr/sbin
	mkdir -p usr/share
	mkdir -p usr/com
	mkdir -p usr/var
	mkdir -p usr/include
	sudo cp /usr/sbin/asterisk $home_directory/$USER/usr/sbin/asterisk
	sudo mv /usr/sbin/asterisk /usr/sbin/asterisk.old
	sleep 5

	echo "Create link symbolic /usr/sbin/asterisk"
	sudo ln -s $home_directory/$USER/usr/sbin/asterisk /usr/sbin/asterisk

	sudo cp /usr/sbin/astcanary $home_directory/$USER/usr/sbin/astcanary
	sudo mv /usr/sbin/astcanary /usr/sbin/astcanary.oldsip.conf
	sleep 5

	echo "Create link symbolic /usr/sbin/astcanary"
	sudo ln -s $home_directory/$USER/usr/sbin/astcanary /usr/sbin/astcanary

	sudo cp /usr/sbin/astdb2bdb $home_directory/$USER/usr/sbin/astdb2bdb
	sudo mv /usr/sbin/astdb2bdb /usr/sbin/astdb2bdb.old
	sleep 5

	echo "Create link symbolic /usr/sbin/astdb2bdb"
	sudo ln -s $home_directory/$USER/usr/sbin/astdb2bdb /usr/sbin/astdb2bdb

	sudo cp /usr/sbin/astdb2sqlite3 $home_directory/$USER/usr/sbin/astdb2sqlite3
	sudo mv /usr/sbin/astdb2sqlite3 /usr/sbin/astdb2sqlite3.old
	sleep 5
	
	echo "Create link symbolic /usr/sbin/astdb2sqlite3"
	sudo ln -s $home_directory/$USER/usr/sbin/astdb2sqlite3 /usr/sbin/astdb2sqlite3

	sudo cp /usr/sbin/astgenkey $home_directory/$USER/usr/sbin/astgenkey
	sudo mv /usr/sbin/astgenkey /usr/sbin/astgenkey.old
	sleep 5
	
	echo "Create link symbolic /usr/sbin/astgenkey"
	sudo ln -s $home_directory/$USER/usr/sbin/astgenkey /usr/sbin/astgenkey
	
	mkdir $home_directory/logs
	cd $home_directory/logs
	sudo cp -R /var/log/asterisk .
	sudo mv /var/log/asterisk /var/log/asterisk.old
	sleep 5
	
	echo "Create link symbolic /var/log/asterisk"
	sudo ln -s $home_directory/logs/asterisk /var/log/asterisk


	



	cd $home_directory
	sudo chown -R $USER.$group *
	cd $home_directory/$USER/src/asterisk-11.4.0
	sudo make clean
	
	if [ "$SSL" == "ssl" ];
        then
			echo "*****************************************************************"
            echo "*********************Configure whit ssl**************************"
            echo "*****************************************************************"
            sleep 5
            sudo ./configure CFLAGS=-mtune=native --libdir=/usr/lib64 -with-hoard=$home_directory/$USER/src/emeryberger-Hoard-d065953/src/
        else
			echo "*****************************************************************"
            echo "******************Configure whitout ssl**************************"
            echo "*****************************************************************"
            sleep 5
            sudo ./configure CFLAGS=-mtune=native --libdir=/usr/lib64 --disable-asteriskssl -with-hoard=$home_directory/$USER/src/emeryberger-Hoa
        fi

	#./configure CFLAGS=-mtune=native --libdir=/usr/lib64 -with-hoard=$home_directory/$USER/src/emeryberger-Hoard-d065953/src/
	sudo make
	sudo make all
	sudo make install exec_prefix="$home_directory/$USER/usr/" prefix="$home_directory/$USER/usr/"
	sudo make install-logrotate



	cd $home_directory/$USER
	mkdir -p usr/lib
	if [ -d /usr/lib/asterisk ];then
		echo "***************************************"
        echo "********El drirectorio es 32 bits*******"
		echo "***************************************"
		sleep 5
		cd $home_directory/$USER
		mkdir -p usr/lib

		sudo cp -R /usr/lib/asterisk $home_directory/$USER/usr/lib
		sudo mv /usr/lib/asterisk /usr/lib/asterisk.old
		sleep 5
		
		echo "Create link symbolic $home_directory/$USER/usr/lib/asterisk"
		sudo ln -s $home_directory/$USER/usr/lib/asterisk /usr/lib/asterisk

	fi

	if [ -d /usr/lib64/asterisk ];then
		echo "***************************************"
        echo "********El drirectorio es 64 bits*******"
		echo "***************************************"
		sleep 5
		cd $home_directory/$USER
		mkdir -p usr/lib64

		sudo cp -R /usr/lib64/asterisk $home_directory/$USER/usr/lib64
		sudo mv /usr/lib64/asterisk /usr/lib64/asterisk.old
		sleep 5
		
		echo "Create link symbolic $home_directory/$USER/usr/lib64/asterisk"
		sudo ln -s $home_directory/$USER/usr/lib64/asterisk /usr/lib64/asterisk

	fi

	



	sudo /etc/init.d/asterisk start
	sleep 10

	sudo rm -rf $home_directory/$USER/src
	sudo chown -R $USER.$group $home_directory

	if [ -f "/var/run/asterisk/asterisk.pid" ];
        then
			echo "***************************************"
        	echo "********Asterisk install succefful*****"
			echo "***************************************"
		#$home_directory/$USER/usr/sbin/asterisk -rvvvvvv
		
        else
			echo "***************************************"
        	echo "ALERT: Asterisk instalation no succefull"
			echo "***************************************"
        fi
    


	#case for determinate option for server type ASR, ACD, IVR.
	case $type in
	"asr" )

	;;

	"ivr" )

	;;

	"acd" )
		
		source $install_directory/config/local.rc

		if [ ! -d "/var/lib/jvm" ];
		then
			sudo mkdir -p /var/lib/jvm
			cd /var/lib/jvm
		else
			cd /var/lib/jvm
		fi
		echo "Copy $install_directory/src/jdk-6u45-linux-x64.bin"
		sudo cp $install_directory/src/jdk-6u45-linux-x64.bin .
		sudo chmod +x jdk-6u45-linux-x64.bin
		sudo ./jdk-6u45-linux-x64.bin
		sudo rm -rf jdk-6u45-linux-x64.bin

		echo "***************************************"
		echo "******Set Default VM on System*********"
		echo "***************************************"

		sudo update-alternatives --install /usr/bin/java java /var/lib/jvm/jdk1.6.0_45/bin/java 20000
        sudo update-alternatives --install /usr/bin/javac javac /var/lib/jvm/jdk1.6.0_45/bin/javac 20000


		echo "****************************************************"
		echo "*******Copy files /var/lib/asterisk/agi-bin*********"
		echo "****************************************************"
		sudo cp -r $install_directory/src/update-acd/agi-bin/* /var/lib/asterisk/agi-bin

		cp $install_directory/src/update-acd/agi-bin/callcenter/src/DBConnection.java /var/tmp/DBConnection.java.ori
		cd /var/tmp/
		sed -e 's/connection = DriverManager.getConnection("jdbc:postgresql:\/\/xxx.xxx.xxx.xxx:port\/callcenter?user=user\&password=password");/connection = DriverManager.getConnection("jdbc:postgresql:\/\/'$IP_DATABASE:$PORT'\/'$DATABASE'?user='$USER_DATABASE'\&password='$PASSWORD_DATABASE'");/g' DBConnection.java.ori > DBConnection.java
		sudo cp /var/tmp/DBConnection.java /var/lib/asterisk/agi-bin/callcenter/src/
		



		cd $home_directory/$USER/var/lib/asterisk/agi-bin/callcenter/
		sudo javac -cp lib/asterisk-java-1.0.0.M3.jar:lib/postgresql-9.1-903.jdbc4.jar:. -d . src/*.java
		#sudo javac -cp /var/lib/asterisk/agi-bin/callcenter/lib/asterisk-java-1.0.0.M3.jar:/var/lib/asterisk/agi-bin/callcenter/lib/postgresql-9.1-903.jdbc4.jar:. -d . /var/lib/asterisk/agi-bin/callcenter/src/*.java
		#sudo cp -r com/ /var/lib/asterisk/agi-bin/callcenter/
		#sudo rm -rf com/

		cat $install_directory/config/extensions.conf >> $home_directory/$USER/etc/asterisk/extensions.conf
		cat $install_directory/config/sip.conf >> $home_directory/$USER/etc/asterisk/sip.conf
		cat $install_directory/config/manager.conf >> $home_directory/$USER/etc/asterisk/manager.conf

		cp $home_directory/$USER/etc/asterisk/manager.conf $home_directory/$USER/etc/asterisk/manager.conf.ori
		sed -e 's/enabled = no/enabled = yes/g' $home_directory/$USER/etc/asterisk/manager.conf.ori > $home_directory/$USER/etc/asterisk/manager.conf

		cp $home_directory/$USER/etc/asterisk/sip.conf $home_directory/$USER/etc/asterisk/sip.conf.ori 
		sed -e 's/context=public/context=ctx-calls/g' $home_directory/$USER/etc/asterisk/sip.conf.ori > $home_directory/$USER/etc/asterisk/sip.conf

		cd $home_directory
		sudo chown -R $USER.$group *

		echo "****************************************************"
		echo "****************Restart Asterisk*******************"
		echo "****************************************************"
		sudo /etc/init.d/asterisk restart
		sleep 10
		cd $home_directory/$USER/var/lib/asterisk/agi-bin/callcenter/


		echo "****************************************************"
		echo "***********Excute Presence screen*******************"
		echo "****************************************************"
		sudo screen -dmS Presence java -cp lib/asterisk-java-1.0.0.M3.jar:lib/postgresql-9.1-903.jdbc4.jar:. com.capanicus.callcenter.PresenceMonitor
		sleep 10

		cd $home_directory/$USER/var/lib/asterisk/agi-bin/callcenter/
		echo "****************************************************"
		echo "***********Excute Billing screen*******************"
		echo "****************************************************"
		sudo screen -dmS Billing java -cp lib/asterisk-java-1.0.0.M3.jar:lib/postgresql-9.1-903.jdbc4.jar:. com.capanicus.callcenter.LiveCallsMonitor
		sleep 10

		cd $home_directory/$USER/var/lib/asterisk/agi-bin/callcenter/
		echo "****************************************************"
		echo "***********Excute AGI screen*******************"
		echo "****************************************************"
		sudo screen -dmS AGI java -cp lib/asterisk-java-1.0.0.M3.jar:lib/postgresql-9.1-903.jdbc4.jar:fastagi-mapping.properties:. -Xms1000m -Xmx1000m org.asteriskjava.fastagi.DefaultAgiServer
		sleep 10

		touch $home_directory/$USER/etc/asterisk/sip_peers.conf


		echo "****************************************************"
		echo "**************Restart Asterisk**********************"
		echo "****************************************************"
		sudo /etc/init.d/asterisk restart
		sleep 10


	esac

;;

"uninstall" )
	echo "estoy en unistall"
	sudo /etc/init.d/asterisk stop
	sudo rm -rf $home_directory/$USER/etc/asterisk /etc/asterisk
	sudo rm -rf $home_directory/$USER/var/lib/asterisk /var/lib/asterisk
	sudo rm -rf $home_directory/$USER/var/spool/asterisk /var/spool/asterisk
	sudo rm -rf $home_directory/$USER/var/run/asterisk /var/run/asterisk
	sudo rm -rf $home_directory/$USER/usr/sbin/asterisk /usr/sbin/asterisk
	sudo rm -rf $home_directory/$USER/usr/sbin/astcanary /usr/sbin/astcanary
	sudo rm -rf $home_directory/$USER/usr/sbin/astdb2bdb /usr/sbin/astdb2bdb
	sudo rm -rf $home_directory/$USER/usr/sbin/astdb2sqlite3 /usr/sbin/astdb2sqlite3
	sudo rm -rf $home_directory/$USER/usr/sbin/astgenkey /usr/sbin/astgenkey
	sudo rm -rf $home_directory/logs/asterisk /var/log/asterisk
	
	cd $home_directory/$USER
	sudo rm -rf $home_directory/$USER/src
	sudo rm -rf $home_directory/$USER/usr
	sudo rm -rf $home_directory/$USER/var 
	sudo rm -rf $home_directory/$USER/etc
	sudo rm -rf $home_directory/$USER/asterisk
	sudo rm -rf $home_directory/logs
	echo "UNINSTALING PACKAGES SNMP"
        sudo apt-get -y purge $packages_snmp
        echo "UNINSTALING PACKAGES ESSENTIALS"
        sudo apt-get -y purge $packages_essential
        echo "UNINSTALING PACKAGES POSTGRESQL"
        sudo apt-get -y purge $packages_postgresql
	sudo rm -rf /etc/asterisk.old
	
	sudo rm -rf /var/lib/asterisk.old
	sudo rm -rf /var/spool/asteisk.old
	sudo rm -rf /var/run/asteisk.old
	sudo rm -rf /usr/sbin/asterisk.old
	sudo rm -rf /usr/sbin/astcanary.oldsip.conf
	sudo rm -rf /usr/sbin/astdb2bdb.old
	sudo rm -rf /usr/sbin/astdb2sqlite3.old
	sudo rm -rf /usr/sbin/astgenkey.old
	sudo rm -rf /var/log/asterisk.old
	sudo rm -rf /etc/init.d/asterisk


	sudo rm -rf /etc/asterisk.old
        
        sudo rm -rf /var/lib/asterisk
        sudo rm -rf /var/spool/asteisk
        sudo rm -rf /var/run/asteisk
        sudo rm -rf /usr/sbin/asterisk
        sudo rm -rf /usr/sbin/astcanary
        sudo rm -rf /usr/sbin/astdb2bdb
        sudo rm -rf /usr/sbin/astdb2sqlite3
        sudo rm -rf /usr/sbin/astgenkey
        sudo rm -rf /var/log/asterisk
        sudo rm -rf /etc/init.d/asterisk
	
    if [ -d /usr/lib64/asterisk ];then
    	sudo rm -rf /usr/lib/asterisk
    	sudo rm -rf /usr/lib64/asterisk.old
   	else
   		sudo rm -rf /usr/lib64/asterisk
   		sudo rm -rf /usr/lib/asterisk.old
   	fi
	sudo update-alternatives --remove java /var/lib/jvm/jdk1.6.0_45/bin/java
    sudo update-alternatives --remove javac /var/lib/jvm/jdk1.6.0_45/bin/javac
    sudo rm -rf /var/lib/jvm/jdk1.6.0_45/

    if [ "$type" == "acd" ];then
		echo "****************************************************"
		echo "***********Remove  screen***************************"
		echo "****************************************************"
    
	    for i in `sudo screen -list | grep .Presence | awk '{print $1}'`; do sudo screen -X -S $i quit;done;
	    for i in `sudo screen -list | grep .Billing | awk '{print $1}'`; do sudo screen -X -S $i quit;done;
	    for i in `sudo screen -list | grep .AGI | awk '{print $1}'`; do sudo screen -X -S $i quit;done;
	fi
;;

esac


