//java program to demonstrate single level inheritance
//author @sadam 15-10-2021
//calculating area and perimeter of square
import java.util.*;
class area
{
	int calculateArea(int side){
		System.out.println("Calculating Area of square.");
		return side*side;
	}
}
class perimeter extends area{
	int calculatePerimeter(int side){
		System.out.println("Calculating perimeter of square.");
		return 4*side;
	}
}
class testSquare{
	public static void main(String[] args) {
		int side;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of one side :");
		side = sc.nextInt();
		perimeter square = new perimeter();
		int area = square.calculateArea(side);
		System.out.println("Area of square with side = "+side+" is : "+area);
		int per = square.calculatePerimeter(side);
		System.out.println("Perimeter of square with side = "+side+" is : "+per);
	}
}