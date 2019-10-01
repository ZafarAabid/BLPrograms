package com.bridgeLabz.functional;
//import XfrD17.StdOut;
public class Stopwatch {
//	public static void main(String asd[])
//	{
	//	Utility.stopWatch();
    private final long start;

    /**
     * Initializes a new stopwatch.
     */
    public Stopwatch() {
        start = System.currentTimeMillis();
    } 
	    public static void main(String[] args) {
	        int n = Integer.parseInt(args[0]);

	        // sum of square roots of integers from 1 to n using Math.sqrt(x).
	        Stopwatch timer1 = new Stopwatch();
	        double sum1 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum1 += Math.sqrt(i);
	        }
	        double time1 = timer1.elapsedTime();
	        System.out.println(sum1+0.2*time1);

	        // sum of square roots of integers from 1 to n using Math.pow(x, 0.5).
	        Stopwatch timer2 = new Stopwatch();
	        double sum2 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum2 += Math.pow(i, 0.5);
	        }
	        double time2 = timer2.elapsedTime();
	        System.out.println(sum2+""+0.2*time2);
	    }
	    public double elapsedTime() {
	        long now = System.currentTimeMillis();
	        return (now - start) / 1000.0;
	    }
	} 
	


