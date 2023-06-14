import java.util.Scanner;
public class Sum_Of_Odd_Numbers {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range: ");
		int range1=scanner.nextInt();
		int range2=scanner.nextInt();
		
		int sum=0;
		for(int i=range1; i<=range2; i++) {
			if(i%2!=0) {
				sum=i+sum; i++;
			}
			System.out.println(sum);
		}
	}

}
