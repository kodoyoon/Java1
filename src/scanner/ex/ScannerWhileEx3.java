package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0; //사용자의 입력을 받아들이고 해당 값을 처리하는데 필요

        System.out.println("숫자를 입력하세요. 입력을 중단하라면 -1 을 입력하세요.");

        while(true) {
            input = scanner.nextInt(); //사용자로부터 정수를 입력받아서 input 에 저장
            if(input == -1 ) {
                break;
            }
            sum += input;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
