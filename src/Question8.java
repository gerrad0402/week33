import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 키(cm)와 몸무게(kg) 입력받기
        System.out.print("키를 입력하세요: ");
        double heightCm = scanner.nextDouble();

        System.out.print("몸무게를 입력하세요: ");
        double weightKg = scanner.nextDouble();

        // 키를 미터로 변환
        double heightM = heightCm / 100;

        // BMI 계산
        double bmi = weightKg / (heightM * heightM);

        // 건강 상태 판별
        String healthStatus;
        if (bmi < 18.5) {
            healthStatus = "저체중";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            healthStatus = "정상";
        } else if (bmi >= 25 && bmi <= 29.9) {
            healthStatus = "과체중";
        } else {
            healthStatus = "비만";
        }

        // 결과 출력
        System.out.printf("당신의 BMI는 %.2f입니다. 건강 상태: %s%n", bmi, healthStatus);
    }
}