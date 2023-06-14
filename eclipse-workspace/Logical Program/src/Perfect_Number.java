import java.util.Scanner;

public class Perfect_Number {
	public static void main(String[] args) {
		
		long n; int i=1; int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		n=scanner.nextLong();
		
		while(i<=n/2) {
			if(n%i==0) {
				sum = sum+i; 
				i++;
			}
			if(sum==n) {
				System.out.println(n + " is a perfect number");
			}
			else {
				System.out.println(n + " is not a perfect number");
			}
		}
	}
}
