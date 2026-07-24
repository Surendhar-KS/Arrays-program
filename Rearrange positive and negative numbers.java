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
		
		
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	        if(arr[i]>=0 && arr[j]<0){
	            int temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	        }
	        }
	    }
	    
	   
	    System.out.print("Reaaranged Array = ");
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
	}
	}
}

===========================


Sample Input
7
-8 1 2 -4 3 4 5
Your Output
Reaaranged Array = -8 -4 2 1 3 4 5 
