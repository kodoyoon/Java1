package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalCost = 0;

        while(true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt(); //몇 번 옵션 선택했는지 받는거임.

            if(option == 1) {

                input.nextLine(); //13 번째 줄에 코드가 숫자만 입력을 받고 엔터를 안해주기 때문에

                System.out.print("상품명을 입력하세요: ");
                String product = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = input.nextInt();

                totalCost += price * quantity; // +를 해주는 이유는 누적을 해줘야 하기 때문에.
                System.out.print("상품명:" +product + " 가격:" + price + " 수량:" + quantity + "합계: " + price * quantity);



            }else if(option == 2) {
                System.out.println("총 비용: " +totalCost);
                totalCost = 0; //결제 후 총 비용 초기화
            }else if(option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
