package advance_level_programs_on_numbers;
/*12. WAP to check whether the given number is a Tech Number or not. */
public class TechCheck {
	public static int countOfDigits(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static int placeValue(int count) {
		int place=1;
		for(int i=1;i<=count/2;i++)
			place*=10;
		return place;
	}
	public static boolean techOrNot(int num) {
		int temp=num;
		int count=countOfDigits(num);
		int place=placeValue(count);
		int sum=0;
		if(count%2==0) {
			int fh=num/place;
			int lh=num%place;
			sum=fh+lh;
		}
		int square=sum*sum;
		return square==temp;
	}
	public static void main(String[] args) {
		boolean te=techOrNot(2026);
		System.out.println(te);
	}
}
