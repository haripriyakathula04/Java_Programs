package medium_level_programs_on_numbers;

import java.util.Scanner;

/*28. WAP to Check if a number is a Fibonacci number. */
public class GivenNumberIsFibonacciNumberOrNot {
	public static void isFibonacci(int n) {
		int a=0;
		int b=1;
		while(true) {
			if(n==a) {
				System.out.println(n+" is present in fibonacci series");
				break;
			}
			if(a>n) {
				System.out.println(n+" is not present in fibonacci series");
				break;
			}
			int c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to check it is present in fibonnaci series or not");
		int n=sc.nextInt();
		isFibonacci(n);
	}
}
