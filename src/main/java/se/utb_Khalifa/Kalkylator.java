package se.utb_Khalifa;
import java.util.Scanner;
public class Kalkylator
{
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean todo= true;

        System.out.println(" Calculator");
        while (todo) {
            printMenu();
            String kalk = in.next();
            System.out.println("enter the  first number you want to calculate");
            int number1 = in.nextInt();
            System.out.println(" enter the next number");
            int number2 = in.nextInt();

            switch (kalk) {
                case "+":
                    System.out.println(addetion(number1, number2));
                    break;
                case "-":
                    System.out.println(substraction(number1, number2));
                    break;
                case "*":
                    System.out.println(multiplication(number1, number2));
                    break;
                case "/":
                    System.out.println(division(number1, number2));
                default:
                    System.out.println("the program was finished");
            }
            System.out.println("Do you want to calculate more: (yes/no)");
            String answer= in.next();
             if(answer.equalsIgnoreCase("no")) {
                todo = false;
                 System.out.println("the system is finish");
            }

        }
    }

    private static void printMenu() {
        System.out.println(" Select one operation to calculate");
        System.out.println(" addition '+' ");
        System.out.println(" subtraction '-'");
        System.out.println(" multiplication '*'");
        System.out.println(" division '/'");
    }

    public  static  double division(double number1, double number2) {
        double number = number1 / number2;
        return number;
    }

    public static int multiplication(int number1, int number2) {
        int number = number1 * number2;
        return number;
    }

          public static int addetion( int number1, int number2) {
        int number = number1 + number2;
        return number;
    }
        public static int  substraction( int number1, int number2) {
            int number = number1 - number2;
            return number;


        }


    }


