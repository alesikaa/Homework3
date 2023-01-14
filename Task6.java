package Homework3;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1=input.nextInt();
        System.out.println("Please enter the second number");
        int number2= input.nextInt();
        System.out.println("Please enter the third number");
        int number3= input.nextInt();

        if(number1> number2 && number1>number3){
            System.out.println("The largest number is "+number1);
        }else if (number2>number3){
            System.out.println("The largest number is "+number2);
        }else {
            System.out.println("The largest number is "+number3);
        }

    }
}
