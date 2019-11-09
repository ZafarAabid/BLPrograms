#!/bin/bash

	for fileList in `ls *.txt`;
	do
	  folderName=`echo $fileList | awk -F . '{print $1}'`;
	  echo "checking for already existing direcotry started";
	  if [ -d $folderName ];
	  then 
		rm -R $folderName;
	  fi
	echo creating folder ${folderName};
	mkdir $folderName;
	echo copying ${fileList} to ${folderName};
	cp $fileList  to $foldername;
	
done
