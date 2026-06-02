package Day_2;
import java.util.Scanner;
public class Question_2 {
   
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.print("Reversed number: ");
        System.out.println(reverse);
    }
}
