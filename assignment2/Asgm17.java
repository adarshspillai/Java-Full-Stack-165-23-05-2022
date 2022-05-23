package assignment2;

public class Asgm17 {

	public static void main(String[] args) {
		int n=153;
		int cntEven=0,cntOdd=0,sumEven=0,sumOdd=0;
		while(n>0) {
			if(n%2==0) {
				cntEven++;
				sumEven=sumEven+n;
			}else {
				cntOdd++;
				sumOdd=sumOdd+n;
			}
			n--;
		}
		int evenAvg,oddAvg;
		evenAvg=sumEven/cntEven;
		oddAvg=sumOdd/cntOdd;
		System.out.println("Average of first N even number is "+evenAvg);
		System.out.println("Average of first N odd number is "+oddAvg);

	}

}
