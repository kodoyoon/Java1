package operator;

public class Logical1 {

    public static void main(String[] args) {

        System.out.println("&&: AND 연산"); // 두 피연산자가 모두 참이여야 true 반환.  둘 중 하나라도 거짓이면 false
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR연산"); // 두 피연산자 중 하나라도 참이면 true를 반환한다. 둘다 모두 거짓이면 false
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산"); //논리적 부정을 반환한다. 참이면 거짓, 거짓이면 참
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
