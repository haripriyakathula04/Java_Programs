package advance_level_programs_on_numbers;

import java.util.Scanner;

/*9. WAP to check whether the given number is a Sunny Number or not. */
//A Sunny Number is a number where the number + 1 is a perfect square.
public class SunnyCheck {
	public static void sunnyOrNot(int num) {
		int temp=num+1;
		boolean cond=true;
		for(int i=1;i<=temp;i++) {
			if(i*i==temp) {
				System.out.println(num+" is a sunny number");
				cond=false;
				break;
			}
		}
		if(cond)
			System.out.println(num+" is not a sunny number");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		sunnyOrNot(num);
	}
}
