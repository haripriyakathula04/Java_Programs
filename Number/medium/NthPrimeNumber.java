package medium_level_programs_on_numbers;

import java.util.Scanner;

/*25. WAP to Print the nth prime number. */
public class NthPrimeNumber {
	public static boolean primeCheck(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		return count==2;
	}
	public static void nthPrime(int num) {
		int count=0;
		for(int i=1;;i++) {
			if(primeCheck(i))
				count++;
			if(count==num) {
				System.out.println(num+"th prime number is "+i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find nth prime");
		int n=sc.nextInt();
		nthPrime(n);
	}
}
