//program to print message according to marks
//Author @sadam
import java.util.*;
class marksMessage{
	public static void main(String[] args) 
	{
		float marks;
		String msg;
		System.out.println("Please enter your marks:");
		Scanner sc = new Scanner(System.in);
        marks = sc.nextFloat();
    	if (marks>=1 && marks<=39)
    		msg = "Sorry, Student has Failed.";
        else if(marks>=40 && marks<=49)
        	msg = "Your Grade - E"; 
        else if(marks>=50 && marks<=59)
        	msg = "Your Grade - D";
        else if(marks>=60 && marks<=69)
        	msg = "Your Grade - C";
        else if(marks>=70 && marks<=79)
        	msg = "Your Grade - B";
        else if(marks>=80 && marks<=89)
        	msg = "Your Grade - A";
        else if(marks>=90 && marks<=100)
        	msg = "Your Grade - O";
        else
        	msg="Please enter valid marks.";
        System.out.println(msg);
	}
}