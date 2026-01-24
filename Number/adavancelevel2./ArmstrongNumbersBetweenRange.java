package advance_level_programs_on_numbers_level2;

import java.util.Scanner;

/*8. WAP to print the Armstrong numbers present in the range of m to n.*/
public class ArmstrongNumbersBetweenRange {
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
	public static void armstrongNumbersBetweenRange(int m,int n) {
		System.out.println("Aramstrong numbers between "+m+" and "+n+" are");
		boolean cond=true;
		for(int i=m;i<=n;i++) {
			if(armstrongOrNot(i)) {
				System.out.println(i);
				cond=false;
			}
		}
		if(cond) {
			System.out.println("No Aramstrong numbers..");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		armstrongNumbersBetweenRange(m, n);
	}
}
