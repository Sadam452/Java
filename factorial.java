import java.util.*;
class factorial{
	public static void main(String[] args) {
		int i,number,result=1;
		System.out.println("Enter any number to calculate its factorial ?");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for (i=number;i>=1;i--) {
			result*=i;
		}
		System.out.println(number+"! = "+result);
	}
}