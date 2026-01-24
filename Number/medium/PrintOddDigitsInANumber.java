package medium_level_programs_on_numbers;

import java.util.Scanner;

/*11. WAP to print odd digits in a given number */
public class PrintOddDigitsInANumber {
	public static boolean oddCheck(int n) {
		return n%2!=0;
	}
	public static void printOddDigits(int num) {
		int count=0;
		System.out.println("Odd digits present in "+num+" is ");
		while(num>0) {
			int ld=num%10;
			if(oddCheck(ld)) {
				System.out.println(ld);
				count++;
			}
			num/=10;
		}
		if(count==0)
			System.out.println("No odd digits present in given number");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		printOddDigits(num);
	}
}
