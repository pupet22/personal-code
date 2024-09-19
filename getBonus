package getBonus;
import java.util.Scanner;
import java.text.NumberFormat;

public class getBonus {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    float hours;
    float rate = 28.16f;
    
    System.out.print("Enter hours worked: ");
    hours = scan.nextFloat();
    
    float salary = hours * rate;
    float bonus = 0.25f * salary;
    
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    String formattedSalary = currency.format(salary);
    String formattedBonus = currency.format(bonus);
    
    System.out.printf("Salary: %s%n", formattedSalary);
    System.out.printf("Bonus: %s%n", formattedBonus);
    }
    
}
