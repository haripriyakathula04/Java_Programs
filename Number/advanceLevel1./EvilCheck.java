package advance_level_programs_on_numbers;
/*14. WAP to check whether the given number is a Evil Number or not. */
public class EvilCheck {
	public static boolean evenOnes(int num) {
		int sum=0;
		while(num>0) {
			int ld=num%2;
			if(ld==1)
				sum++;
			num/=2;
		}
		return sum%2==0;
	}
	public static void main(String[] args) {
		boolean b=evenOnes(87);
		System.out.println(b);
		}
}
