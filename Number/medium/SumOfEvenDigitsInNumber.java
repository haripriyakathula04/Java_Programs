package medium_level_programs_on_numbers;

import java.util.Scanner;

/*14. WAP to print sum of even digits in a given number */
public class SumOfEvenDigitsInNumber {
	public static boolean isEven(int n) {
		if(n%2==0)
			return true;
		else
			return false;
	}
	public static int sumOfEvenDigits(int num) {
		int sum=0;
		while(num>0) {
			int ld=num%10;
			if(isEven(num))
				sum+=ld;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sumOfEvenDigits=sumOfEvenDigits(num);
		if(sumOfEvenDigits==0)
			System.out.println("No even digits present in given number");
		else
			System.out.println("Sum of even digits in "+num+" is "+sumOfEvenDigits);
	}
}
