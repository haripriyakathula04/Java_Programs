package advance_level_programs_on_numbers_level2;

import java.util.Scanner;

/*11. WAP to print the Magic numbers present in the range of m to n. */
public class MagicNumbersBetweenRange {
	public static boolean magicCheck(int num) {		
		while(num>9) {
			int sum=0;
			while(num>0) {
				int ld=num%10;
				sum+=ld;
				num/=10;
			}
			num=sum;
		}
		return num==1;
	}
	public static void magicNumbersBetweenRange(int m,int n) {
		boolean cond=true;
		System.out.println("MagicNumbers between "+m+" and "+n+" are ");
		for(int i=m;i<=n;i++) {
			if(magicCheck(i)) {
				System.out.println(i);
				cond=false;
			}
		}
		if(cond)
			System.out.println("No magicNumbers present");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int m=sc.nextInt();
		System.out.println("Enter ending value");
		int n=sc.nextInt();
		magicNumbersBetweenRange(m, n);
	}
}
