import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int count=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                System.out.println(arr[i]+ " -> "+count);
                count=1;
            }
            
        }
        System.out.print(arr[n-1]+" -> "+ count);
    }
}


using HashMap

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        for(int key:map.keySet()){
            System.out.println(key +"->"+map.get(key));
        }
    }
}


Sample Input
8
1 5 2 2 2 3 4 4
Your Output
1->1
2->3
3->1
4->2
5->1


