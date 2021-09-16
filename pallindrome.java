//Program to check whether a number is pallindrome or not.
//Author ..@sadam
import java.util.*;
class pallindrome{
	public static void main(String[] args) {
		int number,reverse=0,tmp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check whether it is pallindrome or not: ");
		number = sc.nextInt();
		tmp = number;
		while(tmp!=0){
			reverse = reverse*10 + tmp%10;
			tmp/=10;
		}
	    String msg = (number==reverse)?number+" is a pallindrome number.":number+" is not a pallindrome number.";
        System.out.println(msg);
	}
}