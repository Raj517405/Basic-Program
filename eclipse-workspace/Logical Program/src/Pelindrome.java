
public class Pelindrome {
	public static void main(String[] args) {
		
		int rem, sum=0, temp;
		int n = 3456543;
		
		temp=n;
		while(n>0) {
			rem=n%10;  // getting remainder
			sum = sum*10+rem;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Pallindrome Numbaer");
		else
			System.out.println("Not a pellindrome Number");
	}

}
