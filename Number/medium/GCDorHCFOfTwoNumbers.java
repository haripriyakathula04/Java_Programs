package medium_level_programs_on_numbers;
/*37. WAP to Find the GCD or HCF of two numbers. */
public class GCDorHCFOfTwoNumbers {
	public static void main(String[] args) {
		int n1=8,n2=4;
		int range=0;
		if(n1<=n2)
			range=1;
		else
			range=n2;
		int hcf=0;
		for(int i=1;i<=range;i++) {
			if(n1%i==0&&n2%i==0)
				hcf=i;
		}
		System.out.println(hcf);
	}
}
