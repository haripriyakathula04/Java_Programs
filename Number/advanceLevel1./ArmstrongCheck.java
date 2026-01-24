package advance_level_programs_on_numbers;

import java.util.Scanner;
/*8. WAP to check whether the given number is an Armstrong Number or not.*/
//An Armstrong Number is a number in which the sum of its digits raised to the power of the 
//total number of digits is equal to the number itself. 
public class ArmstrongCheck {
	public static int countOfDigits(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static int exponential(int base,int power) {
		int expo=1;
		for(int i=1;i<=power;i++) {
			expo*=base;
		}
		return expo;
	}
	public static boolean armstrongOrNot(int num) {
		int power=countOfDigits(num);
		int temp=num;
		int sum=0;
		while(num>0) {
			int ld=num%10;
			sum+=exponential(ld, power);
			num/=10;
		}
		return temp==sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(armstrongOrNot(num))
			System.out.println(num+" is a armstrong number");
		else
			System.out.println(num+" is not a armstrong number");
	}
}
