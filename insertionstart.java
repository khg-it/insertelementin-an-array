import java.util.*;
public class insertionstart{
 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int size=sc.nextInt();
        System.out.println("size of an array"+size);
        int num=sc.nextInt();
        System.out.println("number that u want to add at the beginning:"+num);
        for(int i=1;i<=size;i++)
        {
            arr[i]=sc.nextInt();
        }
        size++;
        for(int i=size;i>=1;i--)
        {
                   arr[i]=arr[i-1];
        }
        arr[1]=num;
        System.out.println("array after insertion");
        for(int i=1;i<=size;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}