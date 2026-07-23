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
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        
        int currsum=arr[0];
        int max=arr[0];
        
        for(int i=1;i<n;i++){
            currsum=Math.max(arr[i],currsum+arr[i]);
            if(currsum>max){
                max=currsum;
            }
        }
        System.out.print("Maximum Subarray "+max);
	}
}



----------------------------------------


Sample Input
8
-2 -3 4 -1 -2 1 5 -3
Your Output
Maximum Subarray 7
