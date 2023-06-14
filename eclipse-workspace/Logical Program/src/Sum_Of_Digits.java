
public class Sum_Of_Digits {
	public static void main(String[] args) {
		
		int sum=0; int i=1234;
		
		while(i!=0) {
			int rem=i%10;
			sum=sum+rem;
			i=i/10;
			
		}
		System.out.println(sum);
	}

}
