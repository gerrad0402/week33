public class OperatorExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean flag = false;

        // 복합적인 수식 // flag 앞에 !가있으면 ture로 전환된다 flag 가 false 라고 가정된상태일때
        int result = (++a * b - 15) > (b / 2) && !flag ? a + b : b - a;
        //++a : a=11
        // (++a * b -15) : 11*20 , 220
        //(b / 2): 20/2 = 10
        //(==a * b-15) . ( b/2) : 205>10 = true
        // ! flag = true
        // ture&&ture = true
        // ture ? a+b : b-a ;
        // 11 + 20
        System.out.println("Result: " + result);
    }
}

