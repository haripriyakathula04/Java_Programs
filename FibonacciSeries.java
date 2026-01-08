package basic_level_programs_on_numbers;

import java.util.Scanner;

/*12. WAPTP Fibonacci series*/
public class FibonacciSeries {
	public static void fibonacci(int num) {
		int a=0;
		int b=1;
		for(int i=1;i<=num;i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find n fiboncci numbers");
		int n=sc.nextInt();
		fibonacci(n);
	}
}
