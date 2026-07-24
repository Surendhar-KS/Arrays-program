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
		
	
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		  
		}
		
		boolean sorted =true;
	    for(int i=0;i<n-1;i++){
	        if(arr[i]>arr[i+1]){
	            sorted=false;
	            break;
	        }
	    }
	    if(sorted)
	    System.out.print("Sorted");
        else
        System.out.print("Not Sorted");
	}
}


---------------------------

Sample Input
5
1 2 3 4 5
Your Output
Sorted
