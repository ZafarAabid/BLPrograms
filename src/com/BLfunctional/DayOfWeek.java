/*To the Util Class add dayOfWeek static function that takes a date
 *  as input and prints the day of the week that date falls on.
 *   Your program should take three command-line arguments:
 *    m (month), d (day), and y (year). For m use 1 for January,
 *     2 for February, and so forth. For output print 0 for Sunday,
 *      1 for Monday, 2 for Tuesday, and so forth.
 *       Use the following formulas, for the Gregorian calendar 
 *       (where / denotes integer division):

y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
*/

package com.BridgeLabz.Functional;

public class DayOfWeek {

	public static void main(String asd[])
	{
		int y=Integer.parseInt(asd[2]);
		int m=Integer.parseInt(asd[1]);
		int d=Integer.parseInt(asd[0]);
		Utility.daysOfWeek(d,m,y);
		
	}
}
