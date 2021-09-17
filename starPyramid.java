//Java program to print pyramid of stars
//Author @sadam 
/*        *
         ***
        *****
       *******
      *********            */
import java.util.*;
class starPyramid{
	public static void main(String[] args) {
		int rows,i,j,k,l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		rows = sc.nextInt(); //scan number of rows
		for(i=1,l=rows;i<=rows;i++,l--)
		{
			for(j=l-1;j>0;j--) //print spaces equal to rows left minus 1
				System.out.print(" ");//use print to print data on same line
			for(k=1;k<=2*i-1;k++) //print * equal to rows*2-1
			System.out.print("*");
		System.out.print("\r\n");//newline character
		}
	}
}