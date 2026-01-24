package medium_level_programs_on_numbers;

import java.util.Arrays;
import java.util.Scanner;

/*32. WAP to Find the nth smallest digit in a given number. */
public class NthSmallestDigitInANumber {
	public static int countOfDigits(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static int nthSmallest(int n,int num) {
		int[] arr=new int[countOfDigits(num)];
		for(int i=0;i<=arr.length-1;i++) {
			int ld=num%10;
			arr[i]=ld;
			num/=10;
		}
		Arrays.sort(arr);
		return arr[n-1];
//------------------nth largest digit------------------------------
//		int[] a=new int[arr.length];
//		int index=0;
//		for(int i=arr.length-1;i>=0;i--) {
//			a[index++]=arr[i];
//		}
//		return a[n-1];
//-------------------------------------------------------------
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Enter n value to find nth smallest");
		int n=sc.nextInt();
		int nthSmallest=nthSmallest(n, num);
		System.out.println(n+" smallest digit in "+num+" is "+nthSmallest);
	}
}
