package advance_level_programs_on_numbers_level3;

import java.util.Scanner;

/*2. WAP to print the nth Twisted Prime number. */
public class NthTwistedPrime {
	public static boolean primeCheck(int num) {
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
	public static boolean twistedPrimeOrNot(int num) {
		return primeCheck(num)&&primeCheck(reverse(num));
	}
	public static void nthTwistedPrime(int n) {
		int count=0;
		for(int i=1;;i++) {
			if(twistedPrimeOrNot(i))
				count++;
			if(count==n) {
				System.out.println(i+" is the "+n+"th twisted prime");
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find nth twisted prime");
		int n=sc.nextInt();
		nthTwistedPrime(n);
	}
}
