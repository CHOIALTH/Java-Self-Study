package loop;

public class Break1 {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;

        while(true){
            // while(true) : 무한 반복 되므로 break문 등을 통해 잘 끊어줘야 함!
            sum = sum + i;
            System.out.println(i + "번째 실행");
            if(sum == 10){
                System.out.println("합이 10에 도달!");
                break;
            }
            i++;
        }
    }
}
