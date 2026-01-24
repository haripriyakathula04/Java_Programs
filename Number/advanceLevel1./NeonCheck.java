package advance_level_programs_on_numbers;

import java.util.Scanner;

/*7. WAP to check whether the given number is a Neon Number or not. */
// A Neon Number is a number where the sum of the digits
//of its square is equal to the original number. 
public class NeonCheck {
	public static int sumOfSquareOfEachDigit(int num) {
		int sum=0;
		int s=num*num;
		while(s>0) {
			int ld=s%10;
			sum+=ld;
			s/=10;
		}
		return sum;
	}
	public static boolean neonOrNot(int num) {
		int res=sumOfSquareOfEachDigit(num);
		return res==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(neonOrNot(num))
			System.out.println(num+" is a neon number");
		else
			System.out.println(num+" is not a neon number");
	}
}
