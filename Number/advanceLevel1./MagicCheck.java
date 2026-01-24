package advance_level_programs_on_numbers;

import java.util.Scanner;

/*11. WAP to check whether the given number is a Magic Number or not. */
public class MagicCheck {
	public static void magicOrNot(int num) {
		int temp=num;
		while(num>9) {
			int sum=0;
			while(num>0) {
				int ls=num%10;
				sum=sum+ls;
				num/=10;
			}
			num=sum;
		}
		if(num==1)
			System.out.println(temp+" is a magic number");
		else
			System.out.println(temp+" is not a magic number");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		magicOrNot(num);
//			System.out.println(num+" is a magic number");
//		else
//			System.out.println(num+" is not a magic number");
	}
}
