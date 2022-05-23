package assignment2;

public class Asgm3 {

	public static void main(String[] args) {
		int year =1998;
		if(year%4==0 && (year%400==0)||(year%100!=0)){
			System.out.println("leap year");
			
		}else {
			System.out.println("ommon year");
		}

	}

}
