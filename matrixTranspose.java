//covering 2-D array concept
//Java program to find transpose of matrix
//author @sadam _05-OCT-2021
// Java Program to find
// transpose of a matrix
class matrixTranspose
{
	static int N = 4;//taking dimensions 4 x 4
	static void transpose(int A[][], int B[][])
	{
		int i, j;
		for (i = 0; i < N; i++)
			for (j = 0; j < N; j++)
				B[i][j] = A[j][i];//transpose in matrix B
	}
	
	public static void main (String args[])
	{
		int A[][] = { {1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}}; //initialising 4x4 matrix
	
		int B[][] = new int[N][N], i, j;
	
		transpose(A, B);
	
		System.out.print("Transpose of given matrix is: \n");
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < N; j++)
			System.out.print(B[i][j] + " ");
			System.out.print("\n");
		}
	}
}