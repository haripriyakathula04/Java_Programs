package advance_level_programs_on_numbers_level3;

import java.util.Scanner;

/*5. WAP to print the nth Sunny number. */
public class NthSunnyNumber {
	public static void sunnyCheck(int num) {
		int count=0;
		for(int i=1;;i++) {
			int temp=i+1;
			for(int j=1;j<=temp;j++) {
				if(temp==j*j)
					count++;
				if(count==num) {
					System.out.println(i+" is "+num+"th sunny number");
					return;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find nth twisted prime");
		int n=sc.nextInt();
		sunnyCheck(n);
	}
}
