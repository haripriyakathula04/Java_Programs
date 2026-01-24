package medium_level_programs_on_numbers;

import java.util.Scanner;

/*35. WAP to Find the binary representation of a number. */
public class DecimalToBinary {
	public static int decimalToBinary(int num) {
		int binary=0;
		int place=1;
		while(num>0) {
			int ld=num%2;
			binary+=ld*place;
			place*=10;
			num/=2;
		}
		return binary;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal number to convert it into binary representation");
		int num=sc.nextInt();
		int binary=decimalToBinary(num);
		System.out.println(num+"-->"+binary);
	}
}
