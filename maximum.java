//Java program to print maximum of two numbers
//Author @sadam 
import java.util.*;
class maximum{
	public static void main(String[] args) {
		int num1,num2;
		String msg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		num1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		num2 = sc.nextInt();
		if(num1 == num2)
			msg = "You have entered two equal numbers";
		else
		msg = num1>num2?num1+" is maximum":num2+" is maximum ";
			System.out.print(msg);
	}
}