package advance_level_programs_on_numbers_level3;

import java.util.Scanner;

/*7. WAP to print the nth Magic number. */
public class NthMagicNumber {
	public static boolean magicCheck(int num) {
		while(num>9) {
			int sum=0;
			while(num>0) {
				int ld=num%10;
				sum+=ld;
				num/=10;
			}
			num=sum;
		}
		return num==1;
	}
	public static void nthMagicNumber(int n) {
		int count=0;
		for(int i=1;;i++) {
			if(magicCheck(i))
				count++;
			if(count==n) {
				System.out.println(i+" is "+n+"th magic number");
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find nth magic number");
		int n=sc.nextInt();
		nthMagicNumber(n);
	}
}
