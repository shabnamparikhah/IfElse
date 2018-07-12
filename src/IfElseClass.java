import java.util.Scanner;

public class IfElseClass {
    public static void main(String[] args)
    {
        int number = 10;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a number :");
        int num = scan.nextInt();


        if (number < 10)
            System.out.println("The number is less than 10");
         else if(number>1 || number < 5 )
            System.out.println("The number is between 1 and 5");
        else if (number>5 && number < 10 )
            System.out.println("The number is between 5 and 10");
            else
            System.out.println("The number is Out of Range");

    }
}

