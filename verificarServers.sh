#!/bin/bash


servers01=('161.196.36.221' '161.196.36.222' '161.196.36.223' '161.196.36.224' 
	'161.196.36.225' '161.196.36.226' '161.196.36.227' '161.196.36.228' 
	'161.196.36.229' '161.196.36.230' '161.196.36.231' '161.196.36.232')

for x in ${servers01[@]};do echo "##########VERIFICANDO SERVER $x############# ";
ping -c 4 $x;echo "######################################################## ";done;

servers02=(
'161.196.36.165' '161.196.36.166' '161.196.36.167' 
'161.196.36.168' '161.196.36.208' '161.196.37.10' 
'161.196.37.11' '161.196.37.12' '161.196.37.21' 
'161.196.37.22' '161.196.37.23' '161.196.37.24' 
'161.196.37.25' '161.196.37.26' '161.196.37.27' 
'161.196.37.28' '161.196.36.179' '161.196.36.180' 
'161.196.36.181' '161.196.36.182' '161.196.36.183'
'161.196.36.184' '161.196.36.185' '161.196.36.186' 
'161.196.36.187' '161.196.36.188' '161.196.36.163'
'161.196.36.164')


for x in ${servers02[@]};do echo "##########VERIFICANDO SERVER $x############# ";
ping -c 4 $x;echo "######################################################### ";done;
#ping -c 4 

servers03=('161.196.36.250' '161.196.36.251' '161.196.37.39')
for x in ${servers03[@]};do echo "##########VERIFICANDO SERVER $x############# ";
ping -c 4 $x;echo "######################################################## ";done;


