/**
 *    simple flip Coin multiple times to get average chances of
 *    Occurring head vs tail 
 */

package com.bridgeLabz.functional;
 
public class FlipCoin {
	public static void main(String asd[])
	{
		Utility u = new Utility();
		int trials = Utility.ScannerInt();
		 u.flipTheCoin(trials);
	}

}
