package medium_level_programs_on_numbers;

import java.util.Scanner;

/*27. WAP to Print the nth Fibonacci number */
public class NthFibonacciNumber {
	public static void nthfibonacci(int n) {
		int count=0;
		int a=0;
		int b=1;
		for(int i=1;;i++) {
			count++;
			if(count==n) {
				System.out.println(n+"th fionacci number is "+a);
				break;
			}
			int c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find nth fibonacci");
		int n=sc.nextInt();
		nthfibonacci(n);
	}
}
