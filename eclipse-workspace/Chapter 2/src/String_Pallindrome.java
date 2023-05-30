import java.util.*;

public class String_Pallindrome {

	public static void main(String[] args) {
		
		String original, reverse=""; //Object of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String/ Number to check if it is pellindrome.");
		
		original = in.nextLine();
		int length = original.length();
		
		for(int i = length - 1; i>0; i--)
			reverse = reverse + original.charAt(i);
		
		if(original.equals(reverse))
			System.out.println("Entered String/Number is a pellindrome");
		else
			System.out.println("Entered String/Number is not a pellindrome");
	}

}
