package cond.ex;

public class MovieRateEx {

    public static void main(String[] args) {
        double rating = 6;

        if(rating <= 9) {
            System.out.println("어바웃 타임을 추천합니다.");
        }
        if(rating <= 8) {
            System.out.println("토이스토리 추천합니다.");
        }
        if(rating <= 7) {
            System.out.println("고질라를 추천합니다.");
        }
    }
}
