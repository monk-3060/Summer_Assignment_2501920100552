package Day_2;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        
       
        int originalNumber = number;
        number = Math.abs(number);
        
        int sum = 0;
        
       
        while (number != 0) {
            int lastDigit = number % 10; 
            sum += lastDigit;            
            number = number / 10;        
        }
        
        
        System.out.println("The sum of the digits of " + originalNumber + " is: " + sum);
        
       
        scanner.close();
    }
}
