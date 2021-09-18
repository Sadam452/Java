//java program to calculate area of circle
//author @sadam cse-18-14
import java.util.*;
class area{
	static float calArea(float r){
		return 3.14f*r*r;
	}
	public static void main(String[] args) {
		float radius=0,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		radius = sc.nextFloat();
		result = calArea(radius);
		System.out.println("Area of crcle with radius = "+radius+" is : "+result);
	}
}