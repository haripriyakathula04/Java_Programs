package medium_level_programs_on_numbers;

import java.util.Scanner;

/*12. WAP to print sum of digits in a given number */
public class SumOfDigitsInNumber {
	public static int sumOfDigits(int num) {
		int sum=0;
		while(num>0) {
			int ld=num%10;
			sum+=ld;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=sumOfDigits(num);
		System.out.println("Sum of digits in "+num+" is "+sum);
	}
}
