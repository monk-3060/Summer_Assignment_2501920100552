import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int power = 1;

        for (int i = 1; i <= n; i++) {
            power = power * x;
        }

        System.out.println(power);

        sc.close();
    }
}
