package miscellaneous_number_series;

import java.util.Scanner;

/*4. Find the GCD or HCF of three numbers. */
public class HCFAndGCDOfThreeNumbers {
	public static int HCFAndGCD(int n1,int n2,int n3) {
		int range=1;
		if(n1<=n2&&n1<=n3)
			range=n1;
		else if(n2<=n3)
			range=n2;
		else
			range=n3;
		int hcf=0;
		for(int i=1;i<=range;i++) {
			if(n1%i==0&&n2%i==0&&n3%i==0)
				hcf++;
		}
		return hcf;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
		int n1=sc.nextInt();
		System.out.println("Enter n2");
		int n2=sc.nextInt();
		System.out.println("Enter n3");
		int n3=sc.nextInt();
		int hcf=HCFAndGCD(n1, n2, n3);
		System.out.println("HCF of "+n1+","+n2+","+n3+" is "+hcf);
	}
}
