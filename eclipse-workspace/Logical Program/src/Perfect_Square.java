
public class Perfect_Square {
	public static void main(String[] args) {
		
		int i; int num=16; int temp=0;
		
		for(i=1; i<num; i++) {
			if(i*i==num) {
				temp=1;
				break;
			}
		}
		if(temp==1) {
			System.out.println("Perfect Square "+i);
		}
		else {
			System.out.println("not a Perfect Square");
		}
	}

}
