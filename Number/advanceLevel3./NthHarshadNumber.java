package advance_level_programs_on_numbers_level3;

import java.util.Scanner;

/*8. WAP to print the nth Harshad (Niven) number. */
public class NthHarshadNumber {
	public static boolean harshadCheck(int num) {
		int temp=num;
		int sum=0;
		while(num>0) {
			int ld=num%10;
			sum+=ld;
			num/=10;
		}
		return temp%sum==0;
	}
	public static void nthHarshadNumber(int n) {
		int count=0;
		for(int i=1;;i++) {
			if(harshadCheck(i))
				count++;
			if(count==n) {
				System.out.println(i+" is "+n+"th harshad number");
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find nth harshad number1");
		int n=sc.nextInt();
		nthHarshadNumber(n);
	}
}
