import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 월 입력받기
        System.out.print("월을 입력하세요 (1~12): ");
        int month = scanner.nextInt();

        // 계절 판별
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "잘못된 입력입니다. 1~12 사이의 숫자를 입력하세요.";
        }

        // 결과 출력
        System.out.println("입력한 월은 " + season + "입니다.");
    }
}