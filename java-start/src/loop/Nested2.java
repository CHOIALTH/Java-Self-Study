package loop;

public class Nested2 {
    public static void main(String[] args){
        // rows 층을 갖는 피라미드
        int rows = 4;
        String answer = "*";
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(answer);
            }
            System.out.println();
        }
    }
}

