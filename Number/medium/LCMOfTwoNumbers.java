package medium_level_programs_on_numbers;
/*38. WAP to Find the LCM of two numbers. */
public class LCMOfTwoNumbers {
	public static void lcm(int n1,int n2) {
		int range=0;
		if(n1<=n2)
			range=n1;
		else
			range=n2;
		int hcf=0;
		for(int i=1;i<=range;i++) {
			if(n1%i==0&&n2%i==0)
				hcf=i;
		}
		int lcm=(n1*n2)/hcf;
		System.out.println(lcm);
	}
	public static void main(String[] args) {
		lcm(12,75);
	}
}
