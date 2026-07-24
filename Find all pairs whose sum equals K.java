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
		
		int k=sc.nextInt();
		System.out.println("Pairs are : ");
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	        if(arr[i]+arr[j]==k){
	            System.out.println(arr[i]+" "+arr[j]); 
	        }
	        }
	    }
	   
      
	}
	}


============================

Sample Input
6
1 2 3 4 5 6
7
Your Output
Pairs are : 
1 6
2 5
3 4
