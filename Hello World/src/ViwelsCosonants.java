
public class ViwelsCosonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "This website";
        int vowels = 0, consonants = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }

}
}
