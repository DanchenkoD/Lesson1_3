import java.util.Scanner;

public class acm_2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 2;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += scanner.nextInt();
        }

        System.out.println(sum);

    }

}
