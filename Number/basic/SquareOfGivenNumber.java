package basic_level_programs_on_numbers;

import java.util.Scanner;

/*8. WAPTP square of a given number*/
public class SquareOfGivenNumber {
	public static int square(int n) {
		return n*n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find it's square value");
		int num=sc.nextInt();
		int squareOfNumber=square(num);
		System.out.println(num+"^2 is "+squareOfNumber);
	}
}
