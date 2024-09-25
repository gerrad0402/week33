import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 숫자 입력받기
        System.out.print("첫 번째 숫자: ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자: ");
        double num2 = scanner.nextDouble();

        // 연산자 입력받기
        System.out.print("연산자 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // switch 문을 사용하여 연산 처리
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("오류: 0으로 나눌 수 없습니다.");
                    return; // 프로그램 종료
                }
                break;
            default:
                System.out.println("오류: 잘못된 연산자입니다.");
                return; // 프로그램 종료
        }

        // 결과 출력
        System.out.println("결과: " + result);
    }
}