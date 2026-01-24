package miscellaneous_number_series;

import java.util.Scanner;

/*2. Print the factorial series up to n terms. */
public class FactorialSeriesUptoNTerms {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void factorialSeries(int n) {
		for(int i=1;i<=n;i++) {
			int fact=factorial(i);
			System.out.println("factorial of "+i+"-->"+fact);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find factorial Series upto n");
		int n=sc.nextInt();
		factorialSeries(n);
	}
}
