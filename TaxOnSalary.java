import java.util.Scanner;
public class TaxOnSalary
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary");
        double salary =sc.nextDouble();
        if (salary>=250000 && salary<=500000)
        {
            double tax = (salary*5)/100;
            System.out.println("your tax to be paid is 5% which is =" +tax);
        }
        else if(salary>=500000 && salary<=1000000)
        {
            double tax = (salary*20)/100;
            System.out.println("your tax to be paid is 20% which is =" +tax);
        }
        else if(salary>=1000000)
        {
            double tax =(salary*30)/100;
            System.out.println("your tax is 30% of your salary  which is ="+tax );
        }
        else if(salary<250000)
        {
            System.out.println("you don't have to pay the tax");
        }
    }


}
