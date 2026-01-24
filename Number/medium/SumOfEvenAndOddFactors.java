package medium_level_programs_on_numbers;

import java.util.Scanner;

/*7. WAP to print sum of even and odd factors in a given number.*/
public class SumOfEvenAndOddFactors {
	public static void factors(int num) {
		int evenSum=0;
		int oddSum=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				if(isEven(i)) {
					evenSum+=i;
				}
				else
					oddSum+=i;
			}
		}
		System.out.println("Sum of even factors of "+num+" is "+evenSum);
		System.out.println("Sum of odd factors of "+num+" is "+oddSum);
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
