package Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TestThings {

	public static void main(String [] args) throws UnsupportedEncodingException {
		byte[] b_arr = {71, 101, 101, 107, 115};
		/*
		 * Construct a new String by decoding the byte array.
		 * It uses the platform’s
		 * default character set for decoding 
		 */
		String s_byte =new String(b_arr);
		System.out.println(s_byte);
		/*
		 * Construct a new String by decoding the byte array.
		 * It uses the char_set_name
		 * for decoding
		 */
		String s = new String(b_arr, "US-ASCII");
		System.out.println(s);
		/* Construct a new string from the bytes array 
		 * depending on the start_index(Starting location) 
		 * and length(number of characters from starting location*/
	String sa = new String(b_arr, 0, 3);
		System.out.println(sa);
		/*
		 * Construct a new String by decoding the byte array.
		 * It uses the char_set for
		 * decoding.
		 */
		Charset cs = Charset.defaultCharset();
		String sb = new String(b_arr, 1, 3, cs);
		System.out.println(sb);
		
		/* Construct a new string from the bytes array 
		 * depending on the start_index(Starting location) 
		 * and length(number of characters from starting location).
		 * Uses char_set for decoding */
		Charset cs2 = Charset.defaultCharset();
		String sc = new String(b_arr, 2, 4, cs2);
		System.out.println(sc);
	}
}
