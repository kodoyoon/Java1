package casting;

public class Casting1 {
    public static void main(String[] args) {
        //int < long < double (숫자를 표현할 수 있는 범위)
        int intValue = 10;
        long longValue;
        double doubleValue;


        longValue = intValue; //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue2 = " + doubleValue);

        //double 은 부동소수점을 사용

    }
}
