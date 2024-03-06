package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        System.out.println("입력받을 숫자의 갯수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] numbers = new int[n];
        int minNumber, maxNumber;

        System.out.println(n + "개의 정수를 입력하세요:");
        for(int i = 0; i< n; i++) {
            numbers[i] = scanner.nextInt(); //배열에다가 입력받는거 채워 넣는거임
        }

        minNumber = maxNumber = numbers[0]; //배열의 첫번째 값
        for(int i = 1; i < n; i++) {
            if(numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if(maxNumber < numbers[i]){
                maxNumber = numbers[i];
            } //계속 갱신하는 거임.
        }
        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);


    }
}
