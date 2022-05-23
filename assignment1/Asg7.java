package assignment1;

import java.util.Scanner;

public class Asg7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,n;
		System.out.print("input a number");
		n=s.nextInt();
		for(i=1;i<=10;i++) {
		System.out.println(n+"x"+i+"="+(n*i));
		}
		

	}

}
