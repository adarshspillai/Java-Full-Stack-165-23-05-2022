package assignment2;

public class Asgm10 {

	public static void main(String[] args) {
		int rem,sum=0,temp;
		int num=515;
		temp=num;
		while(num>0){
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not palindrome number");
		}
		

	}

}
