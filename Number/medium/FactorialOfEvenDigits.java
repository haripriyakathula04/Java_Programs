package medium_level_programs_on_numbers;

import java.util.Scanner;

/*19. WAP to print the factorial of even digits in a given number */
public class FactorialOfEvenDigits {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static boolean isEven(int n) {
		if(n%2==0)
			return true;
		else
			return false;
	}
	public static int evenDigitsFactorial(int num) {
		int count=0;
		System.out.println("Factorial of even digits:");
		while(num>0) {
			int ld=num%10;
			if(isEven(ld)) {
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
		int count=evenDigitsFactorial(num);
		if(count==0)
			System.out.println("No even digits persent in given number");
	}
}
