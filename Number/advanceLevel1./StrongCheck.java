package advance_level_programs_on_numbers;

import java.util.Scanner;
//145,40585
/*6. WAP to check whether the given number is a Strong Number or not. */
//A Strong Number is a number whose sum of the factorial
//of its digits is equal to the original number.
public class StrongCheck {
	public static int factorial(int n) {
		int sum=0;
		while(n>0) {
			int fact=1;
			int ld=n%10;
			for(int i=1;i<=ld;i++) {
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		return sum;
	}
	public static boolean strong(int num) {
		int sum=factorial(num);
		return sum==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(strong(num))
			System.out.println(num+" is a strong number");
		else
			System.out.println(num+" is not a strong number");
	}
}
