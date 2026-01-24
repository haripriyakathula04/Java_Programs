package miscellaneous_number_series;

import java.util.Scanner;

/*1. Print the Lucas series up to n terms*/
public class LucasSeriesUptoNTerms {
	public static void lucas(int n) {
		int a=2,b=1;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find lucas Series upto n");
		int n=sc.nextInt();
		lucas(n);
	}
}
