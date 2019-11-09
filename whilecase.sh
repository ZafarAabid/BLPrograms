#!/bin/bash -x

valid=true
count=1;
while [ $valid ]
	do
        	echo $count
       	 if [ $count -eq 3 ]
        then
                break
        else
                (( count++ ))
        fi
done

