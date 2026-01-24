package medium_level_programs_on_numbers;

import java.util.Scanner;

/*30. WAP to Find the smallest digit in a given number.*/
public class SmallestDigitInANumber {
	public static int largest(int num) {
		int smallest=Integer.MAX_VALUE;
		while(num>0) {
			int ld=num%10;
			if(ld<smallest)
				smallest=ld;
			num/=10;
		}
		return smallest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find smallest digit in it");
		int n=sc.nextInt();
		int smallestDigit=largest(n);
		System.out.println("smallest digit in "+n+" is "+smallestDigit);
	}
}
