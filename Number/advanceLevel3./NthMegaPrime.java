package advance_level_programs_on_numbers_level3;

import java.util.Scanner;

/*3. WAP to print the nth Mega Prime number. */
public class NthMegaPrime {
	public static boolean primeCheck(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static boolean eachDigitPrimeCheck(int num) {
		while(num>0) {
			int ld=num%10;
			if(!primeCheck(ld))
				return false;
			num/=10;
		}
		return true;
	}
	public static boolean megaPrime(int num) {
		return primeCheck(num)&&eachDigitPrimeCheck(num);
	}
	public static void nthMegaPrime(int n) {
		int count=0;
		for(int i=1;;i++) {
			if(megaPrime(i))
				count++;
			if(count==n) {
				System.out.println(i+" is the "+n+"th megaPrime");
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find nth mega prime");
		int n=sc.nextInt();
		nthMegaPrime(n);
	}
}
