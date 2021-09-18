//java program to calculate factorial of number using recursion
//author @sadam cse-18-14
import java.util.*;
class factorialRecursive{
	static int factorial(int n){
		if(n==1 || n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	public static void main(String[] args) {
		int number,result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number >= 0: ");
		number = sc.nextInt();
		if(number>=0)
		result = factorial(number);
		System.out.println(number+"! = "+result);
	}
}
