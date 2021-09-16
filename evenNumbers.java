import java.util.*;
class evenNumbers{
	public static void main(String[] args) {
		int i,upperLimit,count=0;
		System.out.println("You want to display even numbers upto ?");
		Scanner sc = new Scanner(System.in);
		upperLimit = sc.nextInt();
		for (i=0;i<=upperLimit;i++) {
			if(i%2 == 0){
				System.out.println(i);
				++count;
			}
		}
		System.out.println("There are "+count+" even numbers from 0 to "+upperLimit);
	}
}