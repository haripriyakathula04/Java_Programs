package basic_level_programs_on_numbers;

import java.util.Scanner;

/*3. WAPTP product of the numbers between m to n*/
public class ProductOfNumbersBetweenMAndN {
	public static int productBetweenMAndN(int m,int n) {
		int prod=1;
		for(int i=m;i<=n;i++) {
			prod*=i;
		}
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		int product=productBetweenMAndN(m,n);
		System.out.println("Product of the numbers between "+m+" and "+n+" is "+product);
	}
}
