package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader(); //먼저수행
        System.out.println("프로그램이 동작합니다.");// 그 다음
        printFooter(); //마지막
    }

    public static void printHeader() {
        System.out.println("프로그램을 시작합니다.");
        return;
    }

    public static void printFooter() {
        System.out.println("프로그램을 종료합니다.");
    }
}
