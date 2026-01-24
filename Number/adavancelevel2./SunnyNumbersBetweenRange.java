package advance_level_programs_on_numbers_level2;

import java.util.Scanner;

/*9. WAP to print the Sunny numbers present in the range of m to n. */
public class SunnyNumbersBetweenRange {
	public static void sunnyOrNot(int m,int n) {
		System.out.println("Sunny numbers between "+m+" and "+n+" are");
		boolean cond=true;
		for(int i=m;i<=n;i++) {
			int temp=i+1;
			for(int j=1;j<=temp;j++) {
				if(j*j==temp) {
					System.out.println(i);
					cond=false;
				}
			}
		}
		if(cond)
			System.out.println("No sunny numbers..");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		sunnyOrNot(m, n);
	}
}
