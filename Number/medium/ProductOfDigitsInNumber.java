package medium_level_programs_on_numbers;

import java.util.Scanner;

/*13. WAP to print product of digits in a given number */
public class ProductOfDigitsInNumber {
	public static int productOfDigits(int num) {
		int product=1;
		while(num>0) {
			int ld=num%10;
			product*=ld;
			num/=10;
		}
		return product;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int product=productOfDigits(num);
		System.out.println("product of digits in "+num+" is "+product);
	}
}
