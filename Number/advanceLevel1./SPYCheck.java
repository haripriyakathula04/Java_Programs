package advance_level_programs_on_numbers;

import java.util.Scanner;

/*4. WAP to check whether the given number is a SPY Number or not. */
public class SPYCheck {
	public static boolean spy(int num) {
		int sum=0,prod=1;
		while(num>0) {
			int ld=num%10;
			sum+=ld;
			prod*=ld;
			num/=10;
		}
		return sum==prod;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(spy(num))
			System.out.println(num+" is SPY number");
		else
			System.out.println(num+" is not a SPY number");
	}
}
