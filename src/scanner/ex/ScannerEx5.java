package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            int temp = num1;
            num1 =  num2;
            num2 = temp;
        }
        System.out.print("두 숫자 사이의 모든 정수: ");

        for(int i = num1; i <= num2; i++) {
            System.out.print(i);

            if(i != num2) { //i가 마지막에 왔을때가 아니면 그때만 쉼표를 출력하고, 마지막값에 왔을때는 출력을 안한다
                System.out.print(",");
            }
        }
    }
}
