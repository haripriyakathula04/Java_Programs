package basic_level_programs_on_numbers;

import java.util.Scanner;

public class FactorialOfGivenNumber {
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find it's factorial");
		int num=sc.nextInt();
		int fact=factorial(num);
		System.out.println("Factorial of "+num+" is "+fact);
	}
}
