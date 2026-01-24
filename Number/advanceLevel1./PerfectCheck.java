package advance_level_programs_on_numbers;

import java.util.Scanner;

/*5. WAP to check whether the given number is a Perfect Number or not. */
//A Perfect Number is a number that is equal to the sum of its factors 
//(excluding the number itself). 
public class PerfectCheck {
	public static boolean perfectOrNot(int num) {
		int sum=0;
		int end=num/2;
		for(int i=1;i<=end;i++) {
			if(num%i==0)
				sum+=i;
		}
		return sum==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(perfectOrNot(num))
			System.out.println(num+" is perfect");
		else
			System.out.println(num+" is not perfect");
	}
}
