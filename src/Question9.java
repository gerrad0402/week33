import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 숫자 입력받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        // 연산자 입력받기
        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // if-else 문을 사용하여 연산 처리
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("결과: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("결과: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("결과: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("결과: " + result);
            } else {
                System.out.println("오류: 0으로 나눌 수 없습니다.");
            }
        } else {
            System.out.println("오류: 잘못된 연산자입니다.");
        }
    }
}