package advance_level_programs_on_numbers_level2;

import java.util.Scanner;

/*5. WAP to print the Perfect numbers present in the range of m to n. */
public class PerfectNumbersBetweenRange {
	public static boolean perfectCheck(int num) {
		int sum=0;
		int temp=num;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				sum+=i;
		}
		return sum==temp;
	}
	public static void perfectNumbersBetweenRange(int m,int n) {
		System.out.println("Prefect numbers between "+m+" and "+n+" are");
		boolean cond=true;
		for(int i=m;i<=n;i++) {
			if(perfectCheck(i)) {
				System.out.println(i);
				cond=false;
			}
		}
		if(cond) {
			System.out.println("No perfect mumbers..");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		perfectNumbersBetweenRange(m, n);
	}
}
