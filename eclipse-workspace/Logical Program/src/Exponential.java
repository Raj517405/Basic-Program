import java.util.Scanner;

public class Exponential {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter base: ");
		int base=scanner.nextInt();
		System.out.println("Enter Power: ");
		int expo=scanner.nextInt();
		
		int result=1;
		for(int i=1; i<=expo; i++) {
			result=result*base;
		}
		System.out.println(result);
	}

}
