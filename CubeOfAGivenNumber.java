package basic_level_programs_on_numbers;

import java.util.Scanner;

/*9. WAPTP cube of a given number*/
public class CubeOfAGivenNumber {
	public static int cube(int n) {
		return n*n*n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find it's cube");
		int num=sc.nextInt();
		int cubeOfNumber=cube(num);
		System.out.println(num+"^3 is "+cubeOfNumber);
	}
}
