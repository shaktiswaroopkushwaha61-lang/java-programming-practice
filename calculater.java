import java.util.Scanner;
public class calculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number;");
        double number1 = sc.nextDouble();
        System.out.println("enter operater to perform operation(+,-,*,/ %)");
        char operater = sc.next().charAt(0);
        System.out.println("enter second number;");
        double number2 = sc.nextDouble();
        switch(operater){
            case '+':
                System.out.println("result =" +(number1 + number2));
                break;
            case '-':
                System.out.println("result =" +(number1 - number2));
                break;

            case '*':
                System.out.println("result =" +(number1 * number2));
                break;
            case '/':
                if (number2 == 0){
                    System.out.println("division by zero not allowed");
                }
                 else {
                    double result = number1/number2;
                    System.out.println("result" + result);
                }
                break;
            default:
                System.out.println("error invalid operater entered");
                break;



           }

        sc.close();
    }
}
