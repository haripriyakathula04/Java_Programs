package medium_level_programs_on_numbers;

import java.util.Scanner;

/*8. WAP to print product of even and odd factors in a given number */
public class ProductOfEvenAndOddFactors {
	public static void factors(int num) {
		int evenProduct=1;
		int oddProduct=1;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				if(isEven(i)) {
					evenProduct*=i;
				}
				else
					oddProduct*=i;
			}
		}
		System.out.println("Product of even factors of "+num+" is "+evenProduct);
		System.out.println("Product of odd factors of "+num+" is "+oddProduct);
	}
	public static boolean isEven(int n) {
		return n%2==0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find sum even factors and sumof add factors");
		int num=sc.nextInt();
		factors(num);
	}
}
