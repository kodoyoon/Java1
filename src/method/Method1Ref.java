package method;

public class Method1Ref {
    public static void main(String[] args) {

        int sum1 = add(5, 10);
        System.out.println("결과1 출력:" + sum1);

        int sum2 = add(15,20);
        System.out.println("결과2 출력:" + sum2);

    }
//add 메서드
    public static int add(int a, int b) { // 6, 9 번째 로부터 값을 전달받고, 15번째 실행
        System.out.println(a + "+" + b + "연산 수행");
        int sum = a + b;
        return sum; //7, 10 에 return 해줌
    }
}
