package medium_level_programs_on_numbers;

import java.util.Scanner;

/*15. WAP to print sum of prime digits in a given number*/
public class SumOfPrimeDigitsInNumber {
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		return count==2;
	}
	public static int sumOfPrimeDigits(int num) {
		int sum=0;
		while(num>0) {
			int ld=num%10;
			if(isPrime(ld))
				sum+=ld;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sumOfPrimes=sumOfPrimeDigits(num);
		if(sumOfPrimes==0)
			System.out.println("No prime digits present in given number");
		else
			System.out.println("Sum of prime digits in "+num+" is "+sumOfPrimes);
	}
}
