//Armstrong Number a is number that is equal to the sum of cubes of it's digits.

public class Armstrong {
	public static void main(String[] args) {
		
		int n=153; int arms=0; int n2=n;
		
		while(n!=0) {
			int rem=n%10;
			arms +=rem*rem*rem;
			n=n/10;
		}
		if(n2==arms) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}

}
