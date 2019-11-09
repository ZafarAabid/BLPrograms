#!/bin/bash -x

ratePerHr=100;
maxHr=0;
isPartTime=1;
isFullTime=2;
sum=0;
limit=50;

while [ $maxHr -le $limit ]
do
for (( day=1; day -le 20; day++))
do
        randomCheck=$(( RANDOM % 3))
        case $randomCheck in
        $isFullTime)
                workingHr=6 ;;
        $isPartTime)
                workingHr=3
        ;;
        *)
                workingHr=0
        ;;
        esac

        wage=$(( $ratePerHr * $workingHr ))
        sum=$(( $sum + $wage ))
	maxHr++
	echo $maxHr
done
done


