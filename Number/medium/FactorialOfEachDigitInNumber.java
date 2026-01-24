package medium_level_programs_on_numbers;

import java.util.Scanner;

/*17. WAP to print the factorial of each digit in a given number. */
public class FactorialOfEachDigitInNumber {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void factorialOfEachDigit(int num) {
		while(num>0) {
			int ld=num%10;
			int factorial=factorial(ld);
			System.out.println("Factorial of "+ld+" is "+factorial);
			num/=10;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		factorialOfEachDigit(num);
	}
}
