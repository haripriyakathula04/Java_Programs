package basic_level_programs_on_numbers;

import java.util.Scanner;

/*14. WAPT extract digits in reverse order*/
public class ExtractDidigitsInReverseOrder {
	public static void extractAndReverse(int num) {
		while(num>0) {
			int ld=num%10;
			//15.print
			System.out.println(ld);
			num/=10;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Digits present "+num+" in Reverse order the digits are");
		extractAndReverse(num);
	}
}
