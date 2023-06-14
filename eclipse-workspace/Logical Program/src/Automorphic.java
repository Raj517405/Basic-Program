import java.util.Scanner;
public class Automorphic {

	public static void main(String[] args) {
		
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a Number: ");
		
		int n=scanner.nextInt();
		
		int square = n*n;
		String nString = Integer.toString(n);
		String squareString = Integer.toString(square);
		
		String lastNDigit = squareString.substring(squareString.length()-nString.length());
		
		if(lastNDigit.equals(nString)) {
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println("Not a Automorphic Number");
		}
		
	}

}
