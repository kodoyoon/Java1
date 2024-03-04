package array;

public class ArrayDi0 {
    public static void main(String[] args) {

        // 2 x 3 배열

        int [] [] arr = new int[2][3]; // 행(row), 열(column)

        arr[0][0] = 1; // 0,0
        arr[0][1] = 2; // 0,1
        arr[0][2] = 3; // 0,2
        arr[1][0] = 4; // 1,0
        arr[1][1] = 5; // 1,1
        arr[1][2] = 6; // 1,2

        //0행 출력
        System.out.print(arr[0][0] + " "); // 0열 출력
        System.out.print(arr[0][1] + " "); // 1열 출력
        System.out.print(arr[0][2] + " "); // 2열 출력
        System.out.println(); //한 행이 끝나면 라인을 변경한다.

        //1행 출력
        System.out.print(arr[1][0] + " "); // 0열 출력
        System.out.print(arr[1][1] + " "); // 1열 출력
        System.out.print(arr[1][2] + " "); // 2열 출력

        System.out.println(); //한 행이 끝나면 라인을 변경한다.

    }
}
