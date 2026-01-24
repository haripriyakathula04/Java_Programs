package advance_level_programs_on_numbers_level2;

import java.util.Scanner;

/*1. WAP to print the Twisted Prime numbers present in the range of m to n.*/
public class TwistedPrimesBetweenrange {
	public static boolean primeCheck(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)
			return true;
		else
			return false;
	}
	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			int ld=num%10;
			rev=rev*10+ld;
			num/=10;
		}
//		System.out.println(rev);
		return rev;
	}
	public static boolean twistedPrimeCheck(int num) {
		int rev=reverse(num);
		return primeCheck(num)&&primeCheck(rev);
	}
	public static void twistedPrimesBetweenRange(int m,int n) {
		System.out.println("Twisted primes between "+m+" and "+n+" are ");
		boolean cond=true;
		for(int i=m;i<=n;i++) {
			if(twistedPrimeCheck(i)) {
				System.out.println(i);
				cond=false;
			}
		}
		if(cond)
			System.out.println("No twisted primes present");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		twistedPrimesBetweenRange(m, n);
	}
}
