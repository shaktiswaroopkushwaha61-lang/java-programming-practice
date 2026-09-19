package Methods;
import java.util.*;
public class ReverceArray {

     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of element");
        int length= sc.nextInt();
        int[]arr=new int  [length];
        for (int i=1;i<length; i++)
        {
            System.out.println("enter the elements of array ");
            arr[i]=sc.nextInt();
        }
        for(int j=(length-1); j>=0; j--)
        {
            System.out.print(arr[j] +" ");
        }





    }
}
