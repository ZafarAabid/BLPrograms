import java.io.*;
import java.util.*;

/*Desc -> Read the Text from a file, split it into words and arrange it
 *        as Linked List.Take a user input to search a Word in the List.
 *        If the Word is not found then add it to the list, and if it found
 *        then remove the word from the List. In the end save the list into
 *        a file
b. I/P -> Read from file the list of Words and take user input to search a Text
c. Logic -> Create a Unordered Linked List. The Basic Building Block is
          the Node Object. Each node object must hold at least two
          pieces of information. One reference to the data field and second
          the reference to the next node object.
d. O/P -> The List of Words to a File.
*/

public class UnorderedListCode {
	public static void main(String asd[]) throws FileNotFoundException,IOException
	{
		// Create file and ReadWrite
		File file=fileGen();
		String[] str= splitFile(file); 
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
//		
//		Node next,prev;
//		String token;
//		LinkedList ls=new LinkedList();
//		for (int i = 0; i < str.length; i++) {
//			ls.add(new Node(str[i]));
//		}
//		for (Iterator i = ls.iterator(); i.hasNext();) {
//	         System.out.println(i.next());
//	      }
	}

	private static String[] splitFile(File file) throws FileNotFoundException,IOException
	{
		FileReader fr = new  FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String str=br.readLine();
		System.out.println(str);
		String[] strs=new String[10];
//		for (int i = 0; i < str.length(); i++) {
//			String temp="";
//			if(Character.isAlphabetic(str.charAt(i)))
//			{
//				temp+=str.charAt(i);
//			}
//			else
//			{
//				int j=0;
//				strs[j]=temp;
//				temp="";
//				j++;
//			}
//		}
		return strs;

	}

	private static File fileGen() 
	{
	File file=new File("Dome1.txt");
	FileReader fr;
	try {
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		
//		fr = new FileReader(file);
//		BufferedReader br=new BufferedReader(fr);
		bw.write("This,is,PC,welcome,to,Program");
		return file;
		
	} 
	catch (FileNotFoundException e) {

		e.printStackTrace();
	}catch (IOException e) {

		e.printStackTrace();
	}
	
	return null;
	}

	
	static class Node
	{
		Node node;
		String data;
		public Node(String string) {
			this.data=data;
			node=null;
		
		}
		
	}
}
