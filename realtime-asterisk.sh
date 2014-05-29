#!/usr/bin/bash


if [ -h /etc/odbcins.ini ];then 
	echo 'Eliminando Link Simbolico /etc/odbcins.ini'
	sudo rm /etc/odbcins.ini
	sudo touch /etc/odbcins.ini
fi
if [ -h /etc/odbc.ini ];then 
	echo 'Eliminando Link Simbolico /etc/odbc.ini'
	sudo rm /etc/odbc.ini
	sudo touch /etc/odbc.ini
fi

sudo /etc/asterisk/res_odbc.conf /etc/asterisk/res_odbc.conf.ori
sudo /etc/asterisk/extconfig.conf /etc/asterisk/extconfig.conf.ori

sudo cat > /etc/asterisk/res_odbc.conf
sudo cat > /etc/asterisk/extconfig.conf

sudo echo '[PostgreSQL]' >> /etc/odbcins.ini
sudo echo 'Description=ODBC for PostgreSQL' >> /etc/odbcins.ini
sudo echo 'Driver=/usr/lib/odbc/psqlodbca.so' >> /etc/odbcins.ini
sudo echo 'Setup=/usr/lib/odbc/libodbcpsqlS.so' >> /etc/odbcins.ini
sudo echo 'FileUsage=1' >> /etc/odbcins.ini

sudo echo '[asterisk-connector]' >> /etc/odbc.ini
sudo echo 'Description=PostgreSQL connection to 'Telephone DB snpp02' database' >> /etc/odbc.ini
sudo echo 'Driver=PostgreSQL' >> /etc/odbc.ini
sudo echo 'Database=snpp02' >> /etc/odbc.ini
sudo echo 'Servername=10.1.189.72' >> /etc/odbc.ini
sudo echo 'Port=9953' >> /etc/odbc.ini
sudo echo 'Protocol=8.1' >> /etc/odbc.ini
sudo echo 'ReadOnly=No' >> /etc/odbc.ini
sudo echo 'RowVersioning=No' >> /etc/odbc.ini
sudo echo 'ShowSystemTables=No' >> /etc/odbc.ini
sudo echo 'ShowOidColumn=No' >> /etc/odbc.ini
sudo echo 'FakeOidIndex=No' >> /etc/odbc.ini
sudo echo 'ConnSettings=No ' >> /etc/odbc.ini


sudo echo '[asterisk]' >> /etc/asterisk/res_odbc.conf
sudo echo 'enabled => yes' >> /etc/asterisk/res_odbc.conf
sudo echo 'dsn => asterisk-connector' >> /etc/asterisk/res_odbc.conf
sudo echo 'username => snpp02' >> /etc/asterisk/res_odbc.conf
sudo echo 'password => 2013#Cantv' >> /etc/asterisk/res_odbc.conf
sudo echo 'pooling => no' >> /etc/asterisk/res_odbc.conf
sudo echo 'limit => 1' >> /etc/asterisk/res_odbc.conf
sudo echo 'pre-connect => yes' >> /etc/asterisk/res_odbc.conf




sudo echo '[settings]' >> /etc/asterisk/extconfig.conf
sudo echo 'sippeers => odbc,asterisk,cc_sip_users' >> /etc/asterisk/extconfig.conf
sudo echo 'sipusers => odbc,asterisk,cc_sip_users' >> /etc/asterisk/extconfig.conf
sudo echo 'sipregs => odbc,asterisk,cc_sip_regs' >> /etc/asterisk/extconfig.conf
sudo echo 'iaxusers => odbc,asterisk,cc_iax_users' >> /etc/asterisk/extconfig.conf
sudo echo 'iaxpeers => odbc,asterisk,cc_iax_users' >> /etc/asterisk/extconfig.conf
sudo echo 'extensions => odbc,asterisk,cc_dialplan' >> /etc/asterisk/extconfig.conf
sudo echo 'voicemail => odbc,asterisk,cc_voicemail_users' >> /etc/asterisk/extconfig.conf
sudo echo 'queues => odbc,asterisk,cc_queues' >> /etc/asterisk/extconfig.conf
sudo echo 'queue_members => odbc,asterisk,cc_queue_members' >> /etc/asterisk/extconfig.conf
sudo echo 'queue_log => odbc,asterisk,cc_queue_metrics' >> /etc/asterisk/extconfig.conf
sudo echo 'meetme => odbc,asterisk,cc_meetme' >> /etc/asterisk/extconfig.conf
sudo echo 'musiconhold => odbc,asterisk,cc_musiconhold' >> /etc/asterisk/extconfig.conf
