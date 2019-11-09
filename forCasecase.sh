#!/bin/bash -x

ratePerHr=8;
isPartTime=1;
isFullTime=2;
sum=0;

for(( day=1; day<=20; day++))
do
	randomCheck=$(( RANDOM % 3))
	case $randomCheck in
	$isFullTime)
		workingHr=6
	;;
	$isPartTime)
		workingHr=3
	;;
	*)
		workingHr=6
	;;
	esac
	
	wage=$(( $ratePerHr * $workingHr ))
	sum=$(( $sum + $wage ))
done
