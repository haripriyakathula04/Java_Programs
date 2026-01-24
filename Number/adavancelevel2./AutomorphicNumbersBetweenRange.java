package advance_level_programs_on_numbers_level2;

import java.util.Scanner;

/*10. WAP to print the Automorphic numbers present in the range of m to n. */
public class AutomorphicNumbersBetweenRange {
	public static int countOfDigits(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static boolean automorphicCheck(int num) {
		int square=num*num;
		int place=1;
		for(int i=1;i<=countOfDigits(num);i++) {
			place*=10;
		}
		int last=square%place;
		return last==num;
	}
	public static void automorphicNumbersBetweenRange(int m,int n) {
		boolean cond=true;
		System.out.println("Automorphic numbers between "+m+" and "+n+" are");
		for(int i=m;i<=n;i++) {
			if(automorphicCheck(i)) {
				System.out.println(i);
				cond=false;
			}
		}
		if(cond)
			System.out.println("No automorphics present..");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		automorphicNumbersBetweenRange(m, n);
	}
}
