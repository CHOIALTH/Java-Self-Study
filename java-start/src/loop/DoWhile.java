package loop;

public class DoWhile {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;
        int endNum = 10;

        do {
            // 코드블럭
            System.out.println(i +"번째 실행됐어요");
            i++;
        }while(i <= endNum); //조건

    }
}
