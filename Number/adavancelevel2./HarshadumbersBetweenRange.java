package advance_level_programs_on_numbers_level2;

import java.util.Scanner;
import java.util.function.Predicate;

/*13. WAP to print the Harshad (Niven) numbers present in the range of m to n.*/
public class HarshadumbersBetweenRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		Predicate<Integer> p1=num->{
			int sum=0;
			int temp=num;
			while(num>0) {
				int ld=num%10;
				sum+=ld;
				num/=10;
			}
			return temp%sum==0;
		};
		boolean cond=true;
		System.out.println("Harshad numbers between "+m+" and "+n+ "are");
		for(int i=m;i<=n;i++) {
			if(p1.test(i)) {
				System.out.println(i);
				cond=false;
			}
		}
		if(cond)
			System.out.println("No harshad numbers present..");
	}
}
