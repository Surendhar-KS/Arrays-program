import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 0;

        for (int i = 1; i < n; i++) {

            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


//  Remove duplicates from a sorted array using TreeSet
import java.util.*;
class Main{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
      TreeSet<Integer>t=new TreeSet<>();
      for(int i=0;i<n;i++)
      {
          t.add(sc.nextInt());
      }
      for(int e:t)
      {
      System.out.print(e+" ");
      }
        
    }
}
