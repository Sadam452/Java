//Java program to print minimum of two numbers
//Author @sadam 
import java.util.*;
class minimum{
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
		msg = num1<num2?num1+" is minimum":num2+" is minimum ";
			System.out.print(msg);
	}
}