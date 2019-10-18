package com.bridgelabz.programs;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.*;

import com.bridgelabz.utility.Scan;
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
public class Regex {
	  static Scan scan = new Scan();
      static String message = "Hello <<name>>, We have your full"
              +"name as <<full name>> in our system."+"\n"
              +"Your contact number is 91-xxxxxxxxxx." +"\n"
              +"Please,let us know in case of any clarification Thank you BridgeLabz xx/xx/xxxx";
      
	  public static void main(String[] args) {
        regex();
      
    }
    /**java.util.regex.Pattern>class method used to validate regular expressions
     * that Either they are in proper format or not*/
    public static boolean isNumberValid(String mobno)
    {
        Pattern p = Pattern.compile("\\d{10}");
        Matcher m = p.matcher(mobno);
        return (m.find() && m.group().equals(mobno));
    }
    public static void regex()
    {
    	System.out.println("Enter your full name ");
        String username = scan.scannerLine();
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String[] arr = username.split(" ");
        String firstname = arr[0];
        String str1 = message.replace("<<full name>>", username);
        String str2 = str1.replace("<<name>>", firstname);
        System.out.println("Enter 10 digit mobile number ");
        String mobileNumber = scan.scannerLine();
        if(isNumberValid(mobileNumber))
        	{
        		String str3 = str2.replace("xxxxxxxxxx", mobileNumber);
        		String str4 = str3.replaceAll("xx/xx/xxxx", dateFormat.format(date));
        		System.out.println(str4);
        	}
        else     System.out.println("Mobile Number is not valid");
        
    }
    
 
}
	





//public static boolean isDateValid(String date) {
//Pattern p = Pattern.compile("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$");
//Matcher m = p.matcher(date);
//return (m.find() && m.group().equals(date));
//}
//