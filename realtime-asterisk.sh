#!/bin/bash


if [ -h /etc/odbcinst.ini ];then 
	echo "Eliminando Link Simbolico /etc/odbcinst.ini"
	sudo rm /etc/odbcinst.ini
	sudo touch /etc/odbcinst.ini
fi
if [ -h /etc/odbc.ini ];then 
	echo "Eliminando Link Simbolico /etc/odbc.ini"
	sudo rm /etc/odbc.ini
	sudo touch /etc/odbc.ini
fi

sudo aptitude update
sudo aptitude install odbc-postgresql

sudo cp /etc/asterisk/res_odbc.conf /etc/asterisk/res_odbc.conf.ori
sudo cp /etc/asterisk/extconfig.conf /etc/asterisk/extconfig.conf.ori
sudo cp /etc/asterisk/cdr_odbc.conf /etc/asterisk/cdr_odbc.conf.ori
sudo cp /etc/asterisk/cdr.conf /etc/asterisk/cdr.conf.ori

sudo chmod 777 /etc/asterisk/res_odbc.conf
sudo chmod 777 /etc/asterisk/extconfig.conf
sudo chmod 777 /etc/odbcinst.ini
sudo chmod 777 /etc/odbc.ini
sudo chmod 777 /etc/asterisk/cdr_odbc.conf
sudo chmod 777 /etc/asterisk/cdr.conf

sudo echo > /etc/asterisk/res_odbc.conf
sudo echo > /etc/asterisk/extconfig.conf
sudo echo > /etc/odbcinst.ini
sudo echo > /etc/odbc.ini
sudo echo > /etc/asterisk/cdr_odbc.conf
sudo echo > /etc/asterisk/cdr.conf

sudo echo "[PostgreSQL]" >> /etc/odbcinst.ini
sudo echo "Description=ODBC for PostgreSQL" >> /etc/odbcinst.ini
sudo echo "Driver=/usr/lib/odbc/psqlodbca.so" >> /etc/odbcinst.ini
sudo echo "Setup=/usr/lib/odbc/libodbcpsqlS.so" >> /etc/odbcinst.ini
sudo echo "FileUsage=1" >> /etc/odbcinst.ini

sudo echo "[asterisk-connector]" >> /etc/odbc.ini
sudo echo "Description=PostgreSQL connection to 'Telephone DB snpp02' database" >> /etc/odbc.ini
sudo echo "Driver=PostgreSQL" >> /etc/odbc.ini
sudo echo "Database=snpp02" >> /etc/odbc.ini
sudo echo "Servername=10.1.189.72" >> /etc/odbc.ini
sudo echo "Port=9953" >> /etc/odbc.ini
sudo echo "Protocol=8.1" >> /etc/odbc.ini
sudo echo "ReadOnly=No" >> /etc/odbc.ini
sudo echo "RowVersioning=No" >> /etc/odbc.ini
sudo echo "ShowSystemTables=No" >> /etc/odbc.ini
sudo echo "ShowOidColumn=No" >> /etc/odbc.ini
sudo echo "FakeOidIndex=No" >> /etc/odbc.ini
sudo echo "ConnSettings=No" >> /etc/odbc.ini


sudo echo '[asterisk]' >> /etc/asterisk/res_odbc.conf
sudo echo 'enabled => yes' >> /etc/asterisk/res_odbc.conf
sudo echo 'dsn => asterisk-connector' >> /etc/asterisk/res_odbc.conf
sudo echo 'username => snpp02' >> /etc/asterisk/res_odbc.conf
sudo echo 'password => 2013#Cantv' >> /etc/asterisk/res_odbc.conf
sudo echo 'pooling => no' >> /etc/asterisk/res_odbc.conf
sudo echo 'limit => 1' >> /etc/asterisk/res_odbc.conf
sudo echo 'pre-connect => yes' >> /etc/asterisk/res_odbc.conf




sudo echo "[settings]" >> /etc/asterisk/extconfig.conf
sudo echo "sippeers => odbc,asterisk,cc_sip_users" >> /etc/asterisk/extconfig.conf
sudo echo "sipusers => odbc,asterisk,cc_sip_users" >> /etc/asterisk/extconfig.conf
sudo echo "sipregs => odbc,asterisk,cc_sip_users" >> /etc/asterisk/extconfig.conf
sudo echo "iaxusers => odbc,asterisk,cc_iax_users" >> /etc/asterisk/extconfig.conf
sudo echo "iaxpeers => odbc,asterisk,cc_iax_users" >> /etc/asterisk/extconfig.conf
sudo echo "extensions => odbc,asterisk,cc_dialplan" >> /etc/asterisk/extconfig.conf
sudo echo "voicemail => odbc,asterisk,cc_voicemail_users" >> /etc/asterisk/extconfig.conf
sudo echo "queues => odbc,asterisk,cc_queues" >> /etc/asterisk/extconfig.conf
sudo echo "queue_members => odbc,asterisk,cc_queue_members" >> /etc/asterisk/extconfig.conf
sudo echo "queue_log => odbc,asterisk,cc_queue_metrics" >> /etc/asterisk/extconfig.conf
sudo echo "meetme => odbc,asterisk,cc_meetme" >> /etc/asterisk/extconfig.conf
sudo echo "musiconhold => odbc,asterisk,cc_musiconhold" >> /etc/asterisk/extconfig.conf


sudo echo "[global]" >> /etc/asterisk/cdr_odbc.conf
sudo echo "dsn=asterisk" >> /etc/asterisk/cdr_odbc.conf
sudo echo "username=snpp02" >> /etc/asterisk/cdr_odbc.conf
sudo echo "password=2013#Cantv" >> /etc/asterisk/cdr_odbc.conf
sudo echo "loguniqueid=yes" >> /etc/asterisk/cdr_odbc.conf
sudo echo "dispositionstring=yes" >> /etc/asterisk/cdr_odbc.conf
sudo echo "table=cc_cdr ;'cdr' is default table name" >> /etc/asterisk/cdr_odbc.conf
sudo echo "usegmtime=no ;set to 'yes' to log in GMT" >> /etc/asterisk/cdr_odbc.conf



sudo echo "[general]" >> /etc/asterisk/cdr.conf

sudo chmod 644 /etc/asterisk/res_odbc.conf
sudo chmod 644 /etc/asterisk/extconfig.conf
sudo chmod 644 /etc/odbcinst.ini
sudo chmod 644 /etc/odbc.ini
sudo chmod 644 /etc/asterisk/cdr_odbc.conf
sudo chmod 644 /etc/asterisk/cdr.conf