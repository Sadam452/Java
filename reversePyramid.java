//Java program to print reverse pyramid of stars
//Author @sadam 18_09_2021
/*
 *******
  *****
   ***
    *      */
import java.util.*;
class reversePyramid{
	public static void main(String[] args) {
		int rows,i,j,k,l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		rows = sc.nextInt(); //scan number of rows
		for(i=1,l=rows;i<=rows;i++,l--)
		{
			for(j=1;j<i;j++) //print spaces equal to current row number minus 1
				System.out.print(" ");//use print to print data on same line
			for(k=2*l-1;k>=1;k--) //print * equal to rows*2-1 in first row
			System.out.print("*");
		System.out.print("\r\n");//newline character
		}
	}
}