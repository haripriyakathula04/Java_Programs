package advance_level_programs_on_numbers;

import java.util.Scanner;

/*2. WAP to check whether the given number is a Mega Prime Number or not.*/
public class MegaPrimeCheck {
	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static boolean megaPrime(int num) {
		if(!isPrime(num))
			return false;
		while(num>0) {
			int ld=num%10;
			if(!(isPrime(ld)))
				return false;
			num/=10;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(megaPrime(num))
			System.out.println(num+" is a mega prime");
		else
			System.out.println(num+" is a not mega prime");
	}
}
