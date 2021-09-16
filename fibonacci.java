//Fibonacci series till the number user wants
//Author @sadam_ cse-18-14
import java.util.*;
class fibonacci{
	public static void main(String[] args) {
		int prev=0,current=1,upperLimit,nextTerm=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upper limit of fibonacci series : ");
		upperLimit = sc.nextInt();
		String series = prev+" "+current+" ";
		for (i=1;current+prev<upperLimit;i++) {
			nextTerm = prev + current;
			series= series+" "+nextTerm;
			prev = current;
			current = nextTerm;
		}
		System.out.println(series);
	}
}