package medium_level_programs_on_numbers;

import java.util.Scanner;

/*26. WAP to Print the next prime number for a given number. */
public class NextPrimeNumber {
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		return count==2;
	}
	public static void nextPrime(int n) {
		int count=0;
		for(int i=1;;i++) {
			if(isPrime(i))
				count++;
			if(count==n+1) {
				System.out.println(n+"+1th prime number is "+i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find nth prime");
		int n=sc.nextInt();
		nextPrime(n);
	}
}
