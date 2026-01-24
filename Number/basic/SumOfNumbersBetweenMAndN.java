package basic_level_programs_on_numbers;

import java.util.Scanner;

/*2. WAPTP sum of the numbers between m to n*/
public class SumOfNumbersBetweenMAndN {
	public static int sumBetweenMAndN(int m,int n) {
		int sum=0;
		for(int i=m;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		int sum=sumBetweenMAndN(m,n);
		System.out.println("Sum of the numbers between "+m+" and "+n+" is "+sum);
	}
}
