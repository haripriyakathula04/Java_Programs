package basic_level_programs_on_numbers;

import java.util.Scanner;

/*17.WAP to find sum of digits in a number*/
/*18.WAP to find product of digits in a number*/
public class SumOfDigitsInNumber {
	//public static int sumOfDigits(int num) {
	public static int productOfDigits(int num) {
		//int sum=0;
		int prod=1;
		while(num>0) {
			int ld=num%10;
			//sum+=ld;
			prod*=ld;
			num/=10;
		}
		//return sum;
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find sum of digits in it ");
		int num=sc.nextInt();
		//int sum=sumOfDigits(num);
		//System.out.println("Sum of digits in "+num+" is "+sum);
		int prod=productOfDigits(num);
		System.out.println("Product of digits in "+num+" is "+prod);
		
	}
}
