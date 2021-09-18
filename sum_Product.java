//java program to find sum & product of two numbers
//Author @sadam
import java.util.*;
class sum_Product{
	public static void main(String ar[])
	{
		int num1,num2,sum=0,product=0;
		System.out.println("Enter any two numbers");
		Scanner Sc =new Scanner(System.in);
		num1 = Sc.nextInt();
		num2 = Sc.nextInt();
		sum = num1 + num2;
		product = num1 * num2;
		System.out.println(num1+" + "+num2+" = "+sum+"\r\n"+num1+" * "+num2+" = "+product);
	}
}