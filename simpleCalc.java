package calc;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int num1 = 0, num2 = 0, operator = 0;

System.out.print("Enter your preferred operator: \n "
        + "1 - addition, 2 - subtraction, 3 - multiplication, 4 - division: ");
operator = scan.nextInt();

System.out.print("Enter your first number: ");
num1 = scan.nextInt();

System.out.print("Enter your second number: ");
num2 = scan.nextInt();



int answer = 0;
switch (operator) {
case 1:
      answer = num1 + num2;
      break;
case 2:
     answer = num1 - num2;
     break;
case 3:
     answer = num1 * num2;
     break;
case 4:
     answer = num1 / num2;
     break;
default:
    System.out.println("Please input a value from 1-4.");
       } 
System.out.print("Answer: " + answer);
    }
    
}
