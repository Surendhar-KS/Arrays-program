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
	
	int n2=sc.nextInt();
	int arr2[]=new int[n2];
	for(int i=0;i<n2;i++){
	    arr2[i]=sc.nextInt();
	}
	
	ArrayList<Integer>l=new ArrayList<>();
	for(int i=0;i<n;i++){
	l.add(arr[i]);
	}
	for(int i=0;i<n2;i++){
	l.add(arr2[i]);
	}
	for(int e:l)
	System.out.print(e+ " ");
	}
}
