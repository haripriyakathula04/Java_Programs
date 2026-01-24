package advance_level_programs_on_numbers_level3;

import java.util.Scanner;

/*6. WAP to print the nth Automorphic number.*/
public class NthAutomorphicNumber {
	public static long countOfDigits(long num) {
		long count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static boolean automorphicCheck(long num) {
		long square=num*num;
		int place=1;
		for(long i=1;i<=countOfDigits(num);i++) {
			place*=10;
		}
		long last=square%place;
		return last==num;
	}
	public static void nthAutomorphicNumber(int n) {
		int count=0;
		for(long i=0;;i++) {
			if(automorphicCheck(i))
				count++;
			if(count==n) {
				System.out.println(i+" is "+n+"th automorphic number");
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find nth automorphic number1");
		int n=sc.nextInt();
		nthAutomorphicNumber(n);
	}
}
