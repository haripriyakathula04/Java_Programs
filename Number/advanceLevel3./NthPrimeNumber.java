package advance_level_programs_on_numbers_level3;

import java.util.Scanner;

/*1. WAP to print the nth Prime number. */
public class NthPrimeNumber {
	public static boolean primeCheck(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static void nthPrime(int n) {
		int count=0;
		for(int i=1;;i++) {
			if(primeCheck(i))
				count++;
			if(count==n) {
				System.out.println(i+" is the "+n+"th prime in prime series");
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
