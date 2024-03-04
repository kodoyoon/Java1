package array;

public class ArrayDi3 {
    public static void main(String[] args) {

        //2x3 2차원배열, 초기화

        int [] [] arr =
            {
                {1,2,3},
                {4,5,6}
            };

        for(int row = 0; row< arr.length; row++) { //arr.length 는 행의 개수
            for(int column = 0; column < arr[row].length; column++) { //arr[row].length 는 3개의 요소 -> 열의 길이를 의미.
                System.out.println(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
