import cgpa.*;
import java.util.*;
class marks{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of subjects :");
		int n = sc.nextInt();
		float marks[] = new float[n];
		int credits[] = new int[n];
		for (int i=0;i<n ;i++ ) {
			System.out.println("Marks obtained in subject 1 = ");
			marks[i] = sc.nextFloat();
			System.out.println("Credits in subject 1 = ");
			credits[i] = sc.nextInt();
		}
		calculateCGPA student = new calculateCGPA();
		float grades = student.calculate(marks,credits,n);
		System.out.println("Your Grades = "+grades);
	}
}