package miscellaneous_number_series;

import java.util.Scanner;

/*5. Generate the first n terms of a Tribonacci sequence. */
public class FirstNTermsOfTribonacciSeries {
	public static void tribonacci(int n) {
		int a=0,b=1,c=1;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			int d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find tribonacci Series upto n");
		int n=sc.nextInt();
		tribonacci(n);
	}
}
