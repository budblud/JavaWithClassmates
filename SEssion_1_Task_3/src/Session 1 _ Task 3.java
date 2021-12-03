

import java.io.BufferedReader;
import java.util.Date;
import java.util.Scanner;

public class IU {
    public static void main(String[] args) {
        //object of the Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
//invoking nextInt() method that reads an integer input by keyboard
//storing the input number in a variable num
        int num = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
//invoking nextInt() method that reads an integer input by keyboard
//storing the input number in a variable num
        sc.close();
        double sum= num + num2;
        double difference= num-num2;
        double product= num*num2;
        int quotient= num/num2;
        System.out.println("The sum is  " + sum + "  The product is  " + product + "  The difference is  "+ difference +  "  The quotient is  " + quotient);



    }

}
