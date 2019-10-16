/**Desc -> Read in the following message: Hello <<name>>, We have your full
name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.
Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.
Use Regex to replace name, full name, Mobile#, and Date with proper value.
b. I/P -> read in the Message
c. Logic -> Use Regex to do the following
i.  Replace <<name>> by first name of the user ( assume you are the user)
ii. replace <<full name>> by user full name.
iii.replace any occurance of mobile number that should be in format
    91-xxxxxxxxxx by your contact number.
iv. replace any date in the format XX/XX/XXXX by current date.
d. O/P -> Print the Modified Message.

 * */
package com.bridgelabz.programs;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import org.codehaus.jackson.map.ObjectMapper;
import com.bridgelabz.utility.*;

public class Regex {
	static Scan scan=new Scan();
	static ObjectMapper mapper =new ObjectMapper();
	static ArrayList<Entry> list = new ArrayList<Entry>();
	static File file=new File("Regex.json");
	static SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	static Date CurrentDate =new Date();

	public static void main(String[] args) 
	{	
		System.out.println("Enter your mobile Number for varification");
		Long number=scan.scannerLong();
		Entry entry=Utility.Validation(number);
		if(entry.getName()==null)
		{
			Utility.newEntry(number);
		}
		else
		{
			sdf.format(CurrentDate);
System.out.println("Hello... "+entry.getName()+", "+
		   "we have your full name as "+ entry.getFullName()+
		   "Your contact number is:"+entry.getMobileNumber()+
		   "\nyou had registered on  "+entry.getDate());
		}
	}
	








}
