package medium_level_programs_on_numbers;
import java.util.Scanner;

/*36. WAP to Find the decimal representation of a binary number.*/
public class BinaryToDecimal {
	public static String binaryToDecimal(int num) {
		int place=1;
		int decimal=0;
		int temp=num;
		boolean cond=true;
		while(num>0) {
			int ld=num%10;
			if(ld==0||ld==1) {
				decimal=decimal+ld*place;
				place*=2;
				cond=false;
			}
			else
				return "Invalid input";
			num/=10;
		}
//		if(cond)
//			return "Invalid input";
//		else
			return "Binary representation of "+temp+" is "+decimal;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number to convert it into decimal representation");
		int num=sc.nextInt();
		String res=binaryToDecimal(num);
		System.out.println(res);
	}
}
