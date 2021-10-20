//Demonstration of threading
//author @sadam________ 20-10-2021
import java.util.*;
import java.lang.Math;
class quadratic extends Thread{
	public void run()
	{
		int x2,x,c;
		double d,root1,root2;
		Scanner sc = new Scanner(System.in);
		String msg = " ";
		try{
			System.out.println("Enter coefficients of X2,x, & constant term:\n");
			x2 = sc.nextInt();
			x  = sc.nextInt();
			c = sc.nextInt();
			d = Math.sqrt(x*x - 4*x2*c);
			if(d<0)
				msg = "Real roots doesn't exist for given equation.";
			else
			{
				root1 = (-x + d)/(2*x2);
				root2 = (-x - d)/(2*x2);
				msg+="Roots of given quadratic equation are :"+root1+" , "+root2;
			}
			System.out.println(msg);
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.toString());
		}
	}
} 
class prime extends Thread{
	public void run(){
		int flag =0,limit;
		String primeSeries ="Prime series :";
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Enter limit of prime number series:");
		limit = sc.nextInt();
		for(int i=2;i<limit;i++){
			for(int j=2;j<=i/2;j++){
				if(i%j == 0)
				{flag = 1;break;}
			}
			if(flag == 0){
				primeSeries+=i;
				primeSeries+=",";
			}
			flag = 0;
		}
		System.out.println(primeSeries);
		Thread.sleep(1000);
	}
	catch(InterruptedException e)
		{
			System.out.println(e.toString());
		}
	}
}
class threadTest{
	public static void main(String[] args) {
		quadratic q = new quadratic();
		prime p = new prime();
		q.start();
		p.start();
	}
}