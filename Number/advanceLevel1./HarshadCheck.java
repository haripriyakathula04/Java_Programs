package advance_level_programs_on_numbers;

import java.util.Scanner;

/*13. WAP to check whether the given number is a Harshad (Niven) Number or not. */
public class HarshadCheck {
	public static int sumOfDigits(int num) {
		int sum=0;
		while(num>0) {
			int ld=num%10;
			sum+=ld;
			num/=10;
		}
		return sum;
	}
	public static boolean harshadOrNot(int num) {
		int sum=sumOfDigits(num);
		return num%sum==0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(harshadOrNot(num))
			System.out.println(num+" is a harshad number");
		else
			System.out.println(num+" is not a harshad number");
	}
}
