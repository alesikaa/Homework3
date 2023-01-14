package Homework3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter Quiz score");
        int quizScore=scanner.nextInt();
        System.out.println("Please enter Mid Term score");
        int midScore=scanner.nextInt();
        System.out.println("Please enter Final score");
        int finalScore=scanner.nextInt();

        if (quizScore+midScore+finalScore>=90){
            System.out.println("Grade A");
        }else if (quizScore+midScore+finalScore>=70 && quizScore+midScore+finalScore<90){
            System.out.println("Grade B");
        }else if (quizScore+midScore+finalScore>=50 && quizScore+midScore+finalScore<70){
            System.out.println("Grade C");
        }else if (quizScore+midScore+finalScore<50){
            System.out.println("Grade F");
        }

    }
}
