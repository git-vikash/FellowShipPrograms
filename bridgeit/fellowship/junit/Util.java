package com.bridgeit.fellowship.junit;

public class Util {
	/*
	 * purpose: static function for convert decimal to binary
	 * @param : passing int value
	 * 
	 * */
	public static void decToBin(int n)
	{
		int n1=(int)Math.pow(2, 16);
		System.out.println(n1);
		int arr[]=new int[n1];
		int i=0,r=0;
		
		while(0<n)
		{
			r=n%2;
			arr[i]=r;
			n=n/2;
			i++;
		}
		
		for(int j=i-1;j>=0;j--)
			System.out.print(arr[j]+" ");
			
	}
	/*
	 * purpose: static function to find the day of week
	 * @param :passing three int value date,month,year
	 * @return: day of week 
	 * */
	public static int dayOfWeek(int d,int m,int y)
	{   
		int y0=y-(14-m)/12;
		
	    int	x = y0 + y0/4-y0/100 + y0/400;
		int	m0 = m + 12 * ((14-m) / 12) -2;
		int d0 = (d + x + (31*m0)/12)%7;
		return d0;		
	}
	
	
	/*
	 * purpose: static function for temperature conversion
	 * @param: passing one double and one string type
	 * @return : conversion 
	 * */
	public static double temperatureConversion(double tem, String t) 
	{
		double con;
		if (t.equals("c") || t.equals("C")) {
			con = (tem * 9 / 5) + 32;
		} else if (t.equals("f") || t.equals("F")) {
			con = (tem - 32) * 5 / 9;
		} else {
			System.out.println("Enter correct input");
			return 0;
		}
		return con;
	}
	/*
	 * purpose: calculates the monthly payments
	 * @param: passing  P, R double type and Y int type
     * @return : conversion 
	 * */
	public static double monthlyPayment(double P, int Y, double R) 
	{
		double n = 12 * Y;
		double r = R / (12 * 100);
		double payment = P * r / (1 - Math.pow((1 + r), -n));
		return payment;
	}
	/*
	 * purpose to calculate sqrt 
	 * @param: passing one value
	 * @return: return double type value
	 *  */
	public static double sqrt(double c) 
	{

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}

		return t;
		
	}

}
