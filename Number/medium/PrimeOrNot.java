package medium_level_programs_on_numbers;

import java.util.Scanner;

/*2. WAP to check whether the given number is prime or not. */
public class PrimeOrNot {
	public static boolean primeCheck(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		return count==2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check weather it is prime or not");
		int num=sc.nextInt();
		if(primeCheck(num))
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
	}
}
