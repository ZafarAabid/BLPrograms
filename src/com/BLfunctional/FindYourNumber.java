package com.BLfunctional;

import java.util.Scanner;

public class FindYourNumber {

	    public static int search(int lo, int hi) {
	        if ((hi - lo) == 1) return lo;
	        int mid = lo + (hi - lo) / 2;
	        StdOut.printf("Is it less than %d?  ", mid);
	        if (StdIn.readBoolean()) return search(lo, mid);
	        else                     return search(mid, hi);
	    }

	    public static void main(String[] args) {
	        int n = Integer.parseInt(args[0]);
//	        int n = (int) Math.pow(2, k);
	        StdOut.printf("Think of an integer between %d and %d and press Enter\n ", 0, n-1);
	        String i=new Scanner(System.in).next();
	        int secret = search(0, n);
	        StdOut.printf("Your number is %d\n", secret);
	    }

	}


