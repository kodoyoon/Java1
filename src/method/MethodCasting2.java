package method;

public class MethodCasting2 {
    public static void main(String[] args) {

        int number = 100;
        printNumber(number);
    }
    private static void printNumber(double n)  { //double 만 받는거야.
        System.out.println("숫자: " + n);
    }
}

//메서드를 호출할 떄는 전달하는 인수의 타입과 매개변수의 타입이 맞아야 한다.
// 단 타입이 달라도 자동 형변환이 가능한 경우에는 호출 할 수 있다.
