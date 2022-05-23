package assignment2;

public class Asgm19 {

	public static void main(String[] args) {
		int row=4;
		int a=0,b=1,c=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				c=a;
				a=b;
				b=c;
			}
			System.out.println();
	
	}

}
}