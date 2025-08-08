import java.util.Scanner;

public class OddNumbers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (a): ");
        int a = scanner.nextInt();

        int count = 0;

        if (a <= 2) {
            count = 1;
        } else if (a == 3 || a == 4) {
            count = 3;
        } else if (a == 5 || a == 6) {
            count = 5;
        } else {
            count = 4;
        }

        int num = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(num);
            if (i < count - 1) {
                System.out.print("");
            }
            num += 2;
        }
    }
}

