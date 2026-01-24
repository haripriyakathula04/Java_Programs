package basic_level_programs_on_numbers;

import java.util.Scanner;

/*11. WAPTP factors of the number */
public class FactorsOfGivenNumber {
	public static void factors(int num) {
		System.out.println("Factors of "+num+" are ");
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find it's factors");
		int num=sc.nextInt();
		factors(num);
	}
}

