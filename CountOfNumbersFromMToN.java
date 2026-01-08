package basic_level_programs_on_numbers;

import java.util.Scanner;

/*4. WAPT count the numbers from m to n*/
public class CountOfNumbersFromMToN {
	public static int countOfNumbersFromMToN(int m,int n) {
		int count=0;
		for(int i=m;i<=n;i++) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		int count=countOfNumbersFromMToN(m,n);
		System.out.println("Count of the numbers between "+m+" and "+n+" is "+count);
	}
}
