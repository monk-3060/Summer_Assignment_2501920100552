import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int n = a; n <= b; n++) {

            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int d = temp % 10;
                sum = sum + (d * d * d);
                temp = temp / 10;
            }

            if (sum == n)
                System.out.print(n + " ");
        }

        sc.close();
    }
}
