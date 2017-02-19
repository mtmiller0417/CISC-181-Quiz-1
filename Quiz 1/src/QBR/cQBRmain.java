package QBR;

import java.util.Scanner;

public class cQBRmain {

	public static void main(String[] args) 
	{
		System.out.print("Enter number of touchdowns: ");
		Scanner inputTDs =  new Scanner(System.in);
		double TDS = (double)inputTDs.nextInt();
		
		System.out.print("Enter number of total yards: ");
		Scanner inputYards = new Scanner(System.in);
		double YARDS = (double)inputYards.nextInt();
		
		System.out.print("Enter number of total interceptions: ");
		Scanner inputInts = new Scanner(System.in);
		double INTS = (double)inputInts.nextInt();
		
		System.out.print("Enter number of total completions: ");
		Scanner inputComps = new Scanner(System.in);
		double COMPS = (double)inputComps.nextInt();

		System.out.print("Enter number of total pass attempts: ");
		Scanner inputAtts = new Scanner(System.in);
		double ATTS = (double)inputAtts.nextInt();
			
		
		double aa = ((COMPS/ATTS) - .3) * 5;
		double a = checking(aa);
		
		double bb = ((YARDS/ATTS) - 3.0) * 0.25;
		double b = checking(bb);
		
		double cc = (TDS/ATTS) * 20;
		double c = checking(cc);
		
		double dd = 2.375 - ((INTS/ATTS) * 25);
		double d= checking(dd);

		double PSR1 = ((a + b + c + d) / 6) * 100;
		double PSR = (double)Math.round(PSR1 * 10)/10;


		System.out.println("Quarterback passer rating: " + PSR);
		
	}
	
		public static double checking (double x)
	{
		if(x > 2.375)
		{
			x = 2.375;
		}
		else if(x < 0)
		{
			x = 0;
		}
		return x;
	}

}
