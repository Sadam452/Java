//sorting of array in java
//author @sadam 05-OCT-2021
import java.util.*;
public class sort {
	public static void main(String[] args)
	{
		int i,size=10;
		int arr[] = new int[size];
		Scanner sc = new Scanner(System.in);
		for (i=0;i<size;i++ ) {
			System.out.println("Enter element at position "+i+" : ");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		// Printing the array after sorting
		for (i=0;i<size;i++ ) {
			System.out.println("Element at position "+i+" is : "+arr[i]);
		}
	}
}
