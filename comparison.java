//Program to compare two numbers... author @sadam
import java.util.*;
class comparison{
	public static void main(String[] args) {
		int num1,num2;
		System.out.println("Enter first number?");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter second number?");
		num2 = sc.nextInt();
		if(num1!=num2){
		String msg = (num1>num2)?num1+" is greater than "+num2:num2+" is greater than "+num1;
	    System.out.println(msg);
	    }else
	    	System.out.println(num1+" is equal to "+num2);
	}
}