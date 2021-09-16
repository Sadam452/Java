import java.util.*;
class Sum
{
	public static void main(String ar[]) {
		int num1,num2,total;
		System.out.println("Enter first number:");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		total=num1+num2;
		System.out.println("sum of two given numbers is :"+total);
	}
}