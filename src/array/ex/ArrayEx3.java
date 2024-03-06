package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); //scanner 에서 입력받은 숫자 값을 넣어야 한다.
        }

        System.out.println("입력한 정수를 역순으로 출력");
        //0,1,2,3,4
        for(int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if(i > 0) { //마지막 쉼표를 없애는거임
                System.out.print(", ");
            }
        }
    }
}
