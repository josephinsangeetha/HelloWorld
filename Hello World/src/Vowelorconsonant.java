import java.util.Scanner;


public class Vowelorconsonant {

	public static void main(String[] args) {
		
		Scanner vowel = new Scanner(System.in);
		System.out.println("Enter the vaue");

		char ch = vowel.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("Given character is an vowel");
			
		}
		else {
			System.out.println("Given character is not an vowel");
		}
	}

}
