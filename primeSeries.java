//Program to generate series of prime numbers
//author @sadam _ cse-18-14
import java.util.*;
class primeSeries{
	public static void main(String[] args) {
		int upperLimit,flag=0,i,j,count=0;
		String msg="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Upper limit of prime number series:");
		upperLimit = sc.nextInt();
		for (i=2;i<=upperLimit;i++ ) {
			for (j=2;j<=i/2 ;j++ ) { //we just need to check till number/2, becausesame factors will repeat
				if (i%j == 0) {
					flag = 1;
				}
			}
			if (flag == 0) {
				msg += i+" ";
				++count;
			}
			flag=0;
		}
        System.out.println(msg);
        System.out.println("There are "+count+" prime numbers from 1 to "+upperLimit);
	}
}