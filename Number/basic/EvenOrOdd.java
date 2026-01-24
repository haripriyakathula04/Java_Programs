package basic_level_programs_on_numbers;

import java.util.Scanner;

/*1. WAPT check whether the given number is even or odd*/
public class EvenOrOdd {
	public static boolean isEven(int num) {
		if(num%2==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check weather it is even or odd");
		int num=sc.nextInt();
		if(isEven(num))
			System.out.println(num+" is an even number");
		else
			System.out.println(num+" is a odd number");
	}
}
