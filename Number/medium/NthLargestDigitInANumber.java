package medium_level_programs_on_numbers;
import java.util.Arrays;
import java.util.Scanner;
/*31. WAP to Find the nth Largest digit in a given number. */
public class NthLargestDigitInANumber {
	public static int countOfDigits(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static int nthLargest(int n,int num) {
		int[] arr=new int[countOfDigits(num)];
		for(int i=0;i<=arr.length-1;i++) {
			int ld=num%10;
			arr[i]=ld;
			num/=10;
		}
		Arrays.sort(arr);
		return arr[arr.length-n];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Enter n value to find nth largest");
		int n=sc.nextInt();
		int nthLargest=nthLargest(n, num);
		System.out.println(n+" largest digit in "+num+" is "+nthLargest);
	}
}
