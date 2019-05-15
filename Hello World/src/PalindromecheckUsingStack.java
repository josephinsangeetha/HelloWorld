import java.util.Stack;


public class PalindromecheckUsingStack {

	public static void main(String[] args) {
		checkPalindromeUsingStack();
	}
	public static void checkPalindromeUsingStack() {
		String stringToCheck = "madam";
		String palindromeString = "";
		
		
		// initialize a stack
                Stack<Character> stack = new Stack<Character>();
               
                
                
                // iterate over the string
		for (int i = 0; i < stringToCheck.length(); i++) {
			char character = stringToCheck.charAt(i);
			stack.push(character);
		}
              
		
		
		// iterate over the stack till it is empty
		while (!stack.isEmpty()) {
                          
			palindromeString = palindromeString + stack.pop();
		}
                
		
		// compare original and reversed strings  
		if (stringToCheck.equals(palindromeString)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
