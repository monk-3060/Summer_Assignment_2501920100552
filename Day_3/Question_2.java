import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int n = a; n <= b; n++) {

            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;
            }

            if (count == 2)
                System.out.print(n + " ");
        }

        sc.close();
    }
}