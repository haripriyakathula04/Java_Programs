package advance_level_programs_on_numbers;

import java.util.Scanner;

/*1. WAP to check whether the given number is Twisted Prime Number or not.*/
public class TwistedPrimeCheck {
	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			int ld=num%10;
			rev=rev*10+ld;
			num/=10;
		}
		return rev;	
	}
	public static boolean twistedPrime(int num) {
		return isPrime(reverse(num))&&isPrime(num);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		boolean twistedPrime=twistedPrime(num);
		if(twistedPrime)
			System.out.println(num+" is a twisted prime");
		else
			System.out.println(num+" is not a twisted prime");
	}
}
