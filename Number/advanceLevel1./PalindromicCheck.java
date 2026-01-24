package advance_level_programs_on_numbers;

import java.util.Scanner;

/*3. WAP to check whether the given number is a Palindrome Number or not*/
public class PalindromicCheck {
	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			int ld=num%10;
			rev=rev*10+ld;
			num/=10;
		}
		return rev;
	}
	public static boolean palindromeOrNot(int num) {
		int rev=reverse(num);
		return rev==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(palindromeOrNot(num))
			System.out.println(num+" is palindrome");
		else
			System.out.println(num+" is not palindrome");
	}
}
