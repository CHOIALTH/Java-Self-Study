package loop;

public class LoopTest4 {
    public static void main(String[] args) {
        // 간단한 구구단 로직
        for(int i = 1; i <= 9; i++){
            System.out.println(i + "단 구구단 시작!");
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println(i + "단 구구단 종료!");
            System.out.println();
        }
    }
}
