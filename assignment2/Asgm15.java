package assignment2;

public class Asgm15 {

	public static void main(String[] args) {
		int num=370,number,result=0,temp;
		number=num;
		while(number!=0)
		{
			temp=number%10;
			result=result+temp*temp*temp;
			number=number/10;
			
		}
		if(result==num) {
			System.out.println(num+"armstrong number");
		}else {
			System.out.println(num+"not armstrong number");
		}
	}

}
