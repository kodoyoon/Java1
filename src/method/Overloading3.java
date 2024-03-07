package method;

public class Overloading3 {
    public static void main(String[] args) {

        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2,1.5));
    }
    public static int add(int a, int b){ // 주석 처리해도 가능, 왜냐면 자동 형변환 int -> double
        System.out.println("1번 호출");
        return a + b;
    }
    //첫 번째 메서드와 이름은 같지만, 매개변수의 유형이 다르다.
    public static double add(double a , double b){
        System.out.println("2번 호출");
        return a + b;
    }

}
