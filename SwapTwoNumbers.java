package basic_level_programs_on_numbers;

import java.util.Scanner;

/*5. WAPT swap two numbers*/
public class SwapTwoNumbers {
	public static void swap(int a,int b) {
		System.out.println("Before swappingg a: "+a+" and b: "+b);
//6.-----------------With using third varaiable------------------
//		int temp=a;
//		a=b;
//		b=temp;
//7.----------------Without using third varaiable-----------------
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swappingg  a: "+a+" and b: "+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		swap(a,b);
	}
}
