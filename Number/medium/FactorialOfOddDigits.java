package medium_level_programs_on_numbers;

import java.util.Scanner;

public class FactorialOfOddDigits {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static boolean isOdd(int n) {
		if(n%2==0)
			return false;
		else
			return true;
	}
	public static int oddDigitsFactorial(int num) {
		int count=0;
		System.out.println("Factorial of odd digits:");
		while(num>0) {
			int ld=num%10;
			if(isOdd(ld)) {
				int factorial=factorial(ld);
				System.out.println("Factorial of "+ld+" is "+factorial);
				count++;
			}
			num/=10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=oddDigitsFactorial(num);
		if(count==0)
			System.out.println("No odd digits persent in given number");
	}
}
