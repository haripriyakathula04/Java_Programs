package medium_level_programs_on_numbers;

import java.util.Scanner;

/*21. WAP to print the power of each digit to the count number of digits in the given number.*/
public class PowerOfEachDigitToTheCountOfDigits {
	public static int countOfDigits(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static int power(int base,int power) {
		int pow=1;
		for(int i=1;i<=power;i++) {
			pow*=base;
		}
		return pow;
	}
	public static void powerOfEacDigit(int num) {
		int power=countOfDigits(num);
		System.out.println("Power of each digit in "+num+ ": ");
		while(num>0) {
			int ld=num%10;
			int pow=power(ld,power);
			System.out.println(ld+"^"+power+": "+pow);
			num/=10;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		powerOfEacDigit(num);
	}
}
