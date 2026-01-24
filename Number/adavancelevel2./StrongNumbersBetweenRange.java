package advance_level_programs_on_numbers_level2;

import java.util.Scanner;

/*6. WAP to print the Strong numbers present in the range of m to n. */
public class StrongNumbersBetweenRange {
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	public static boolean strongCheck(int num) {
		int sum=0;
		int  temp=num;
		while(num>0) {
			int ld=num%10;
			sum+=factorial(ld);
			num/=10;
		}
		return sum==temp;
	}
	public static void strongNumbersBetweenRange(int m,int n) {
		System.out.println("strong numbers between "+m+" and "+n+" are");
		boolean cond=true;
		for(int i=m;i<=n;i++) {
			if(strongCheck(i)) {
				System.out.println(i);
				cond=false;
			}
		}
		if(cond) {
			System.out.println("No strong mumbers..");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		strongNumbersBetweenRange(m, n);
	}
}
