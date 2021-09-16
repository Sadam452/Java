//Program to check whether a year is leap or not... 
//author @sadam_ cse-18-14
import java.util.*;
class ifLeap{
	public static void main(String[] args) {
		int year,flag=-1;
		System.out.println("Enter any year?");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if(year % 4 == 0){
			flag = 1;
			if(year % 100 == 0){
				if(year % 400 ==0)
					flag = 1;
				else
					flag = -1;
			}
		}
		String msg = flag==1?year+" is a leap year.":year+" is not a leap year.";
        System.out.println(msg);
	}
}