
public class Recursionpalindroime {
	 public static boolean isPal(String s)
	    {   
		// int a = s.length();
		 //System.out.println(a);
	        if(s.length() == 0 || s.length() == 1)
	        	
	        	
	            return true; 
	      
		  if(s.charAt(0) == s.charAt(s.length()-1))
			 // System.out.println(s.charAt(0));
		        return isPal(s.substring(1, s.length()-1));
	
	       return false;
	    }

	    public static void main(String[]args)
	    {
	    	
	        String string = "madam";
	       
	        if(isPal(string))
	            System.out.println(string + " is a palindrome");
	        else
	            System.out.println(string + " is not a palindrome");
	    }
}
