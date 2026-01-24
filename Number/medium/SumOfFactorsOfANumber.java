package medium_level_programs_on_numbers;

import java.util.Scanner;

/*5. WAP to print the sum of the factors of a number. */
public class SumOfFactorsOfANumber {
	public static int sumOfFactorsOfNumber(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find sum of factors of it ");
		int num=sc.nextInt();
		int sum=sumOfFactorsOfNumber(num);
		System.out.println("sum of factors of "+num+" is "+sum);
	}
}
