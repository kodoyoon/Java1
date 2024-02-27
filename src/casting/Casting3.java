package casting;

public class Casting3 {
    public static void main(String[] args) {

        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; //int 최고값+ 1
        int intValue = 0;


        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue); //출력 2147483647

        intValue = (int) maxIntOver; //형번환
        System.out.println("maxIntOver casting = " + intValue); //출력 -2147483648
     }
}
// 오버 플로우가 발생하게 되면 시계가 한바퀴 돈 것 처럼 다시 처음부터 시작한다.  -2147483648 이 숫자는 int 의 가장 작은 숫자이다.
// 오버 플로우는 기존 범위를 초과해서 표현하는 것을 의미한다.