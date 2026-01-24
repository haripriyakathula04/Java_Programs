package advance_level_programs_on_numbers;

import java.util.Scanner;

/*10. WAP to check whether the given number is an Automorphic Number or not.*/
//An Automorphic Number is a number whose square ends 
//with the same digits as the number itself. 
public class AutomorphicCheck {
	public static int countOfDigits(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static boolean automorphicOrNot(int num) {
		int square=num*num;
		int digits=countOfDigits(num);
		int place=1;
		for(int i=1;i<=digits;i++) {
			place*=10;
		}
		int last=square%place;
		return last==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(automorphicOrNot(num))
			System.out.println(num+" is an automorphic number");
		else
			System.out.println(num+" is not an automorphic number");
	}
}
