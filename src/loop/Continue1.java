package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while(i<=5) {
            if(i ==3) { //숫자가 3일때 출력을 건너뛰는거
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
