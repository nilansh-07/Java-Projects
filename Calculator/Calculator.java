/*
The Simple Java Calculator program is designed to perform basic arithmetic operations, including addition, subtraction, multiplication, and division. It serves as a practical tool for users to quickly calculate mathematical expressions in a straightforward manner.
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Operator(+,-,*,/):");
        char operator = sc.next().charAt(0);

        System.out.println("Enter two Operand:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        switch (operator) {
            case '+':
                System.out.println("The Addition is: " + (a + b));
                break;

            case '-':
                System.out.println("The Subtraction is: " + (a - b));
                break;

            case '*':
                System.out.println("The Multiplication is: " + (a * b));
                break;

            case '/':
                System.out.println("The Division is: " + (a / b));
                break;

            default:
                System.out.println("Invalid Operator! Please enter a valid Operator.");
        }
    }
}