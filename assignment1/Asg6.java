44package assignment1;

import java.util.Scanner;

public class Asg6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.print("input first numbr");
		a=s.nextInt();
		System.out.print("input second number");
		b=s.nextInt();
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"x"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
	}

}
