package medium_level_programs_on_numbers;

import java.util.Scanner;

/*10. WAP to print even digits in a given number. */
public class PrintEvenDigitsInANumber {
	public static boolean evenCheck(int n) {
		return n%2==0;
	}
	public static void printEvenDigits(int num) {
		int count=0;
		System.out.println("Even digits present in "+num+" is ");
		while(num>0) {
			int ld=num%10;
			if(evenCheck(num)) {
				System.out.println(ld);
				count++;
			}
			num/=10;
		}
		if(count==0)
			System.out.println("No even digits present in given digits");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		printEvenDigits(num);
	}
}
