import java.util.Scanner;
public class GCD {
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
//		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter any 3 number: ");
		int n1 = scanner1.nextInt();
		int n2=scanner1.nextInt();
		int n3=scanner1.nextInt();
		
		int gcd=1;
		for(int i=2; i<=n1 && i<=n2 && i<=n3; i++) {
			if(n1%i==0 && n2%i==0 && n3%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
	}

}
