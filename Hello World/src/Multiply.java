import java.util.Scanner;


public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers");	
		Scanner mul = new Scanner(System.in);
		int a = mul.nextInt(), b= mul.nextInt(), c;

		c= a*b;
		System.out.println("multiply of two numbers" + c);

	}

}
