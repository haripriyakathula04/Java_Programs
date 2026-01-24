package medium_level_programs_on_numbers;

import java.util.Scanner;

/*4. WAP to print the product of prime numbers from m to n */
public class ProductOfPrimesBetweenMAndN {
	public static boolean primeCheck(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static int productOfPrimesBetweenMAndN(int m,int n) {
		int prod=1;
		for(int i=m;i<=n;i++) {
			if(primeCheck(i))
				prod*=i;
		}
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter m value: ");
		int m=sc.nextInt();
		System.out.print("Enter n value: ");
		int n=sc.nextInt();
		int product=productOfPrimesBetweenMAndN(m, n);
		System.out.println("Product of prime numbers between "+m+" and "+n+" is "+product);
	}
}
