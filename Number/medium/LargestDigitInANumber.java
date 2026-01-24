package medium_level_programs_on_numbers;

import java.util.Scanner;

/*29. WAP to Find the largest digit in a given number. */
public class LargestDigitInANumber {
	public static int largest(int num) {
		int largest=0;
		while(num>0) {
			int ld=num%10;
			if(ld>largest)
				largest=ld;
			num/=10;
		}
		return largest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find largest digit in it");
		int n=sc.nextInt();
		int largestDigit=largest(n);
		System.out.println("Largest digit in "+n+" is "+largestDigit);
	}
}
