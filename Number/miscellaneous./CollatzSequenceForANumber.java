package miscellaneous_number_series;

import java.util.Scanner;

/*3. Generate the Collatz sequence for a number.
 	The Collatz sequence (sometimes called the 3n + 1 sequence or hailstone sequence) is a sequence of numbers generated from any positive integer by applying a simple rule repeatedly:
		1.If the current number is even, divide it by 2.
		2.If the current number is odd, multiply it by 3 and add 1.
		3.Repeat this process with each new number you get.
 */
public class CollatzSequenceForANumber {
	public static void collatz(int num) {
		while(num>1) {
			if(num%2==0) {
				num=num/2;
				System.out.println(num);}
			else {
				num=num*3+1;
				System.out.println(num);}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find collatz series");
		int n=sc.nextInt();
		collatz(n);
	}
}
