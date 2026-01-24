package medium_level_programs_on_numbers;

import java.util.Scanner;

/*16. WAP to print product of prime digits in a given number. */
public class ProductOfPrimeDigitsInNumber {
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		return count==2;
	}
	public static int productOfPrimeDigits(int num) {
		int product=1;
		while(num>0) {
			int ld=num%10;
			if(isPrime(ld))
				product*=ld;
			num/=10;
		}
		return product;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int productOfPrimes=productOfPrimeDigits(num);
		if(productOfPrimes==0)
			System.out.println("No prime digits present in given number");
		else
			System.out.println("product of prime digits in "+num+" is "+productOfPrimes);
	}
}
