package Homework3;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your country");

        String country= scanner.nextLine();
        String language="Unknown";

      if (country.equalsIgnoreCase("USA")){
          language= "English" ;
      } else if (country.equalsIgnoreCase("Italy")){
          language="Italian";
      }else if( country.equalsIgnoreCase("Canada")){
          language="French";
      }else if (country.equalsIgnoreCase("Moldova")){
          language="Romanian";
      }else if( country.equalsIgnoreCase("Russia")) {
          language="Russian";
      }
        System.out.println("You speak "+language);
        }

    }

