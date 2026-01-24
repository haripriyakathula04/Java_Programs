package medium_level_programs_on_numbers;

import java.util.Scanner;

/*33. WAP to Find the sum of smallest digit and largest digit in a given number.*/
public class SumOfSmallestAndLargestDigitInANumber {
	public static int sumOfSmallestAdLargestDigit(int num) {
		int largest=0;
		int smallest=Integer.MAX_VALUE;
		while(num>0) {
			int ld=num%10;
			if(ld>largest)
				largest=ld;
			if(ld<smallest)
				smallest=ld;
			num/=10;
		}
		System.out.println(largest);
		System.out.println(smallest);
		int sum=largest+smallest;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sumOfSmallAndLargeDigit=sumOfSmallestAdLargestDigit(num);
		System.out.println("Sum of largest digit and smallest digit is "+sumOfSmallAndLargeDigit);
	}
}
