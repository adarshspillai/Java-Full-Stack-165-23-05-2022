package assignment1;

 import java.util.Scanner;
public class Asg5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num1,num2;
		System.out.print("input first number");
		num1=s.nextInt();
		System.out.print("input second number");
		num2=s.nextInt();
		System.out.println(num1+"x"+num2+"="+(num1*num2));
	}

}
