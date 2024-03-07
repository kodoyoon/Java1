package method;

public class MethodValue2 {

    public static void main(String[] args) {

        int number = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, num1: " + number); //num2 의 변경은 num1 에 영향을 주지 않는다. 왜냐하면
        // 앞서 값을 복사해서 전달했기 때문이다.
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, num2: " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + number);

    }
}
//각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수이다.
