import java.util.Stack;


public class PalindromecheckUsingStack {

	public static void main(String[] args) {
		checkPalindromeUsingStack();
	}
	public static void checkPalindromeUsingStack() {
		String stringToCheck = "madam";
		String palindromeString = "";
		
	
		
                Stack<Character> stack = new Stack<Character>();
               
                
                
               
		for (int i = 0; i < stringToCheck.length(); i++) {
			char character = stringToCheck.charAt(i);
			stack.push(character);
		}
              
		
		
		
		while (!stack.isEmpty()) {
                          
			palindromeString = palindromeString + stack.pop();
		}
                
		
		
		if (stringToCheck.equals(palindromeString)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
