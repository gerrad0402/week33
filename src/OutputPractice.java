public class OutputPractice {
    public static void main(String[] args) {
        int age = 22;
        String hobby = "노는게 제일 좋아";
        String name = "뽀로로";

        System.out.println(name + "("+age+")"+hobby);

        System.out.print(name);
        System.out.print("(");
        System.out.print(age);
        System.out.println(")");
        System.out.print(hobby);

    }
}