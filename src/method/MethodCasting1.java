package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5; //double 을 int 형에 대입하므로 컴파일 오류
        printNumber((int) number); //명시적 형번환을 사용해 double 을 int 로 변환
    }

    public static void printNumber(int n){ //int 만 받는거야
        System.out.println("숫자: " + n);
    }
}
