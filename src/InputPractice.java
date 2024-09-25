import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Nnmber 1 ");
        String first = sc.nextLine();

        System.out.println("Enter Second Nnmber: 2 ");
        int second = sc.nextInt();

        System.out.println("연산자(+,-,*,/): ");
        String a = sc.nextLine();

        System.out.println("결과 : "+first+" "+ a +" "+second);

        sc.close();
    }
}