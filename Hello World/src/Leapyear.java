

	import java.util.Scanner;

	public class Leapyear {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner leap = new Scanner(System.in);
	System.out.println("Enter the year");
	int year = leap.nextInt();

	if((year % 4 == 0) && (year % 100!= 0) || (year%400 == 0))
	{
		System.out.println("Leap year");
		
	}
	else
	{
		System.out.println("Not a leap year");
	}
		}

	}


