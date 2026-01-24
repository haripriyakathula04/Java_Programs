package medium_level_programs_on_numbers;

import java.util.Scanner;

/*9. WAP to count the digits in a given number. */
public class CountOfDigitsInGivenNumber {
	public static int countOfDigits(int num) {
		int count=0;
		while(num>0){
			count++;
			num/=10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to count no.of digits in it ");
		int num=sc.nextInt();
		int count=countOfDigits(num);
		System.out.println("Count of digits in "+num+" is "+count);
	}
}
