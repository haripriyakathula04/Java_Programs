package medium_level_programs_on_numbers;

import java.util.Scanner;

/*18. WAP to print the sum of factorial of each digit in a given number. */
public class SumOfFactorialOfEachDigit {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static int sumOfFactorialOfADigit(int num) {
		int sum=0;
		while(num>0) {
			int ld=num%10;
			int factorial=factorial(ld);
			sum+=factorial;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=sumOfFactorialOfADigit(num);
		System.out.println("Sum of factorial of each digit in "+num+" is "+sum);
	}
}
