import java.util.Scanner;

public class TestOne {

	
	public static int getFib(int n,int arr[])
	{
		if(chechFib(arr,n))//fib
		{
			return arr[n]+arr[n-1];
		}
		if(arr[1]/arr[0]==arr[3]/arr[2])//geo
		{
			return arr[n]*arr[1]/arr[0];
		}
		if(arr[1]-arr[0]==arr[3]-arr[2])//ari
		{
			return arr[n]+2;
		}

	return -999;
	}

	static boolean isPerfectSquare(int x)
	{
	   double s = Math.sqrt(x);
	   return (s*s == x);
	}

	private static boolean chechFib(int[] arr, int n) {
	// TODO Auto-generated method stub
	boolean flag=true;
	for (int i : arr) {
	   if(!isPerfectSquare(5*n*n + 4) ||
	           !isPerfectSquare(5*n*n - 4))
	   {
		   flag=false;
	 
	   }
	}
	return flag;
	}

	public static int getGeo(int n,int arr[])
	{

	return arr[n]+arr[n-1];
	}

	public static void main(String[] args) {
	int n=0;
	Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	           
	        }
	       
	        System.out.println("final:"+TestOne.getFib(n-1, a));
	}
}

