package Day_1;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int count = 0;

        // Handle the case if the user enters 0
        if (num == 0) {
            count = 1;
        } else {
            // Convert negative numbers to positive for counting
            num = Math.abs(num); 
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + originalNum + " is: " + count);
        sc.close();
    }
}
