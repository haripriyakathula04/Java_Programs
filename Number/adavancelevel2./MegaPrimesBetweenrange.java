package advance_level_programs_on_numbers_level2;

import java.util.Scanner;

/*2. WAP to print the Mega Prime numbers present in the range of m to n. */
public class MegaPrimesBetweenrange {
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
	public static boolean megaPrimeOrNot(int num) {
		while(num>0) {
			int ld=num%10;
			if(!(primeCheck(ld)))
				return false;
			num/=10;
		}
		return true;
	}
	public static void megaPrimesBetweenRange(int m,int n) {
		boolean cond=true;
		System.out.println("MegaPrimes between "+m+" and "+n+" are ");
		for(int i=m;i<=n;i++) {
			if(megaPrimeOrNot(i)&&primeCheck(i)) {
				System.out.println(i);
				cond=false;
			}
		}
		if(cond)
			System.out.println("No megaprimes present");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		megaPrimesBetweenRange(m, n);
	}
}
