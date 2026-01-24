package medium_level_programs_on_numbers;
import java.util.Scanner;
/*23. WAP to print the sum of power of even digit to the count number of digits in the given 
number. */
public class SumOfPowerOfEachEvenDigitToTheCountOfDigitsInNumber {
	public static int countOfDigits(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static int power(int base,int power) {
		int pow=1;
		for(int i=1;i<=power;i++) {
			pow*=base;
		}
		return pow;
	}
	public static int sumOfPowerEvenDigit(int num) {
		int sum=0;
		int power=countOfDigits(num);
		while(num>0) {
			int ld=num%10;
			if(ld%2==0) {
				int powerOfEachDigit=power(ld,power);
				sum+=powerOfEachDigit;
			}
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=sumOfPowerEvenDigit(num);
		if(sum==0)
			System.out.println("No even digits");
		else
			System.out.println("Sum of power of even digits to the count of digits: "+sum);
	}
}
