package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5){
            if(i == 3){
                i++;
                continue;
                // 바로 while문의 조건으로 다시 올라감
            }
            System.out.println(i);
            i++;
        }
    }
}
