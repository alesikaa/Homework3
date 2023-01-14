package Homework3;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your grade");
        String grade= scanner.nextLine();

        if (grade.equals("A")){
            System.out.println("Excellent");
        }else if (grade.equals("B")){
            System.out.println("Good");
        }else if (grade.equals("C")){
            System.out.println("Average");
        }else if (grade.equals("D")){
            System.out.println("Bad");
        }else {
            System.out.println("Not Acceptable");
        }
        System.out.println("You entered the grade : "+grade);

    }
}
