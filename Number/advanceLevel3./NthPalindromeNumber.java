package advance_level_programs_on_numbers_level3;

import java.util.Scanner;

/*4. WAP to print the nth Palindrome number. */
public class NthPalindromeNumber {
	public static boolean palindromicCheck(int num) {
		int temp=num;
		int rev=0;
		while(num>0) {
			int ld=num%10;
			rev=rev*10+ld;
			num/=10;
		}
		return rev==temp;
	}
	public static void nthPalindrome(int n) {
		int count=0;
		for(int i=1;;i++) {
			if(palindromicCheck(i))
				count++;
			if(count==n) {
				System.out.println(i+" is the "+n+"th palindrome number");
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find nth mega prime");
		int n=sc.nextInt();
		nthPalindrome(n);
	}
}
