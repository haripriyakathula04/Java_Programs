package medium_level_programs_on_numbers;

import java.util.Scanner;

/*1. WAP to Print the multiplication table of a number*/
public class MultiplicationTable {
	public static void table(int n) {
		for(int i=1;i<=10;i++) {
			int multipication=n*i;
			System.out.println(n+"*"+i+"= "+multipication);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find it's multiplication table");
		int num=sc.nextInt();
		table(num);
	}
}
