package basic_level_programs_on_numbers;

import java.util.Scanner;

public class ExponentialOfGivenNumber {
	public static int exponetial(int base,int power) {
		int expo=1;
		for(int i=1;i<=power;i++) {
			expo*=base;
		}
		return expo;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value");
		int base=sc.nextInt();
		System.out.println("Enter power value");
		int power=sc.nextInt();
		int result=exponetial(base, power);
		System.out.println(base+"^"+power+" = "+result);
	}
}
