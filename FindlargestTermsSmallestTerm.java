import java.util.Scanner;
public class FindlargestTermsSmallestTerm
{
   public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in the array");
        int range= sc.nextInt();
        int[]arr= new int[range];
        int smallest=0;
        int largest=0;
        for(int i=0 ; i<range; i++)
        {
            System.out.println("enter the elements of the array");
            arr[i]=sc.nextInt();
            largest=arr[0];
            if (arr[i]>largest)
            {
              largest=arr[i];
            }
            smallest=arr[0];
            if (arr[i]<smallest)
            {
                smallest =arr[i];
            }
        }
        System.out.println("smallest is "+smallest+" largest is "+largest);
    }

}
