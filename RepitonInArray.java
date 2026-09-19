import java.util.Scanner;
public class RepitonInArray {
     public static void main(String[] args) {

        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements to be entered in the array ");
        int range = sc.nextInt();
        int[] arr = new int[range];
        for (int i = 0; i < range; i++)
        {
            System.out.println("enter the elements");
            arr[i] = sc.nextInt();
        }
        System.out.println(" enter the number to be searched int the array");
        int element = sc.nextInt();
        int k =0;
        for (int j = 0; j<(range); j++)
        {
            if (element == arr[j])
            {
                k++;

            }



        }
        System.out.println("number of times " + element + " appeared in array = " + k);
    }
}
