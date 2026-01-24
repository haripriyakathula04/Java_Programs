package medium_level_programs_on_numbers;

import java.util.Scanner;

/*3. WAP to print the sum of prime numbers from m to n */
public class SumOfPrimesFromMToN {
	public static boolean primeCheck(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		return count==2;
	}
	public static int sumOfPrimesBetweenMAndN(int m, int n) {
		int sum=0;
		for(int i=m;i<=n;i++) {
			if(primeCheck(i))
				sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int sum=sumOfPrimesBetweenMAndN(m, n);
		System.out.println("Sum of primes between "+m+" and "+n+" is "+sum);
	}
}
