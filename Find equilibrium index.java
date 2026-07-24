import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		int totalsum=0;
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		    totalsum+=arr[i];
		}
		
		int leftsum=0;
		
		for(int i=0;i<n;i++){
		    totalsum=totalsum-arr[i];
		    
		    if(totalsum==leftsum){
		        System.out.print("Equilbrium = "+i );
		        return ;
		    }
		    leftsum=leftsum+arr[i];
		}
		
		

	}
}



------------------------------

Sample Input
5
1 3 5 2 2
2
Your Output
Equilbrium = 2
