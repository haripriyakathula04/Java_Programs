package medium_level_programs_on_numbers;

import java.util.Scanner;

/*6. WAP to print the product of the factors of a number. */
public class ProductOfFactorsOfNumber {
	public static int productOfFactorsOfNumber(int num) {
		int product=1;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				product*=i;
		}
		return product;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find product of factors of it ");
		int num=sc.nextInt();
		int product=productOfFactorsOfNumber(num);
		System.out.println("sum of factors of "+num+" is "+product);
	}
}
