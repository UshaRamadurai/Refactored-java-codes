//Goal : Code to Calculate basic mathematical operation with two numbers
package JavaDay2Assignments;

import java.util.Scanner;

public class Calculator {

    public void calculate(){

        while(true) {
            //Getting input from the user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the First number :");
            double number1 = sc.nextDouble();
            System.out.println("Enter the Second number :");
            double number2 = sc.nextDouble();
            System.out.println("Enter the Operation 1.Addition 2.Subtraction 3.Multiplication 4.Division");
            int operation = sc.nextInt();

            //logic to calculate operations
            if(operation<5 && operation>0){
            switch (operation) {
                case 1:
                    System.out.println("The Addition of 2 numbers is :" + (number1 + number2));
                    break;
                case 2:
                    System.out.println("The subtraction of 2 numbers is :" + (number1 - number2));
                    break;
                case 3:
                    System.out.println("The multiplication of 2 numbers is :" + (number1 * number2));
                    break;
                case 4:
                    if (number2 != 0)
                        System.out.println("The division of 2 numbers is :" + (number1 / number2));
                    else
                        System.out.println("Division by zero is not valid");
                    break;
            }

            }else
                System.out.println("Enter valid number between 1-4");
        }

    }

    public static void main(String[] args) {
        Calculator result = new Calculator();
        result.calculate();
    }
}
