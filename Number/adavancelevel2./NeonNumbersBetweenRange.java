package advance_level_programs_on_numbers_level2;

import java.util.Scanner;

/*7. WAP to print the Neon numbers present in the range of m to n. */
public class NeonNumbersBetweenRange {
	public static boolean neonCheck(int num) {
		int square=num*num;
		int sum=0;
		while(square>0) {
			int ld=square%10;
			sum+=ld;
			square/=10;
		}
		return sum==num;
	}
	public static void neonNumbersBetweenRange(int m,int n) {
		System.out.println("neon numbers between "+m+" and "+n+" are");
		boolean cond=true;
		for(int i=m;i<=n;i++) {
			if(neonCheck(i)) {
				System.out.println(i);
				cond=false;
			}
		}
		if(cond) {
			System.out.println("No neon numbers..");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		neonNumbersBetweenRange(m, n);
	}
}
