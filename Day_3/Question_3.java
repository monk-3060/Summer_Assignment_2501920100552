import java.util.Scanner;

public class Question_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {

            int c = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    c++;
            }

            if (c == 2)
                System.out.print(n + " ");
        }

        sc.close();
    }
}

