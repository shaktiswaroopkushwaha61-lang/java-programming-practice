import java.util.Scanner;
public class NumberOfEvenOrOdd
{
     public static void main(String[] args)
    {
        System.out.println("enter number of element to be entered in an array ");
        Scanner sc =new Scanner(System.in);
         int range = sc.nextInt();
         int[]arr= new int[range];
         int odd =0;
         int even=0;
         for(int i=0; i<range;i++)
         {
             System.out.println("enter elements of array");
             arr[i]=sc.nextInt();
         }

         for (int j=0; j<range ; j++)
         {
             if(arr[j]%2==0)
             {
              even++;
             }
             else
             {
                 odd++;
             }
         }
        System.out.println("number of odd terms = "+odd +" no of even terms = "+even);


    }
}
