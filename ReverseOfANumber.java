package basic_level_programs_on_numbers;

import java.util.Scanner;
/*WAP to reverse the given number*/
public class ReverseOfANumber {
	public static int  reverse(int num) {
		int rev=0;
		while(num>0) {
			int ld=num%10;
			rev=rev*10+ld;
			num/=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse it ");
		int num=sc.nextInt();
		int reverse=reverse(num);
		System.out.println("Reverse of "+num+" is "+reverse);
	}
}
