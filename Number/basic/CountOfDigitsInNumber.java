package basic_level_programs_on_numbers;

import java.util.Scanner;

/*WAP to count the no.of digits in given number*/
public class CountOfDigitsInNumber {
	public static int countOfDigits(int num) {
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to count the digits in it ");
		int num=sc.nextInt();
		int count=countOfDigits(num);
		System.out.println("Number of digits in "+num+" is "+count);
	}
}
