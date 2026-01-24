package advance_level_programs_on_numbers_level2;

import java.util.Scanner;

/*3. WAP to print the Palindrome numbers present in the range of m to n. */
public class PalindromesBetweenRange {
	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			int ld=num%10;
			rev=rev*10+ld;
			num/=10;
		}
		return rev;
	}
	public static boolean palindromeCheck(int num) {
		int rev=reverse(num);
		return rev==num;
	}
	public static void palindromicCheckBetweenRange(int m,int n) {
		boolean cond=true;
		System.out.println("Palindromes between "+m+" and "+n+" are");
		for(int i=m;i<=n;i++) {
			if(palindromeCheck(i)) {
				System.out.println(i);
				cond=false;
			}
		}
		if(cond)
			System.out.println("No palindromes present");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		palindromicCheckBetweenRange(m, n);
	}
}
