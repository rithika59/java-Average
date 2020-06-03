import java.util.InputMismatchException;
import java.util.Scanner;

public class Average2 {
    public static void main(String[] args){
        Double num1,num2;
        Scanner usrIp = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        try{
        num1 = usrIp.nextDouble();
        num2 = usrIp.nextDouble();
        Double res = (num1+num2)/2;
        System.out.println("Average of "+num1+ " and "+num2+" is : "+res);
        }catch(InputMismatchException e)
        {
            System.out.println("Must be numbers.");
            System.exit(1);
        }
        
    }
}