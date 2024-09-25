import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("even");
        } else { if (number % 2 == 1)
            System.out.println("odd");
        }
    }
}
