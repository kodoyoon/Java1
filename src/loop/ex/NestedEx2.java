package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) { //몇 줄 짜리인지
            for(int j = 1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
