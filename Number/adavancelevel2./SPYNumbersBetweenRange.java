package advance_level_programs_on_numbers_level2;

import java.util.Scanner;

/*4. WAP to print the SPY numbers present in the range of m to n. */
public class SPYNumbersBetweenRange {
	public static boolean spyCheck(int num) {
		int sum=0;
		int prod=1;
		while(num>0) {
			int ld=num%10;
			sum+=ld;
			prod*=ld;
			num/=10;
		}
		return sum==prod;
	}
	public static void spyBewteenRange(int m,int n) {
		boolean cond=true;
		System.out.println("SPY numbers between "+m+" and "+n+" are");
		for(int i=m;i<=n;i++) {
			if(spyCheck(i)) {
				System.out.println(i);
				cond=false;
			}	
		}
		if(cond)
			System.out.println("No spy numbers..");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		spyBewteenRange(m, n);
	}
}
