package loop;

public class LoopTest2 {
    public static void main(String[] args){
        int num1 = 1;

        while(num1 <= 20){
            if(num1 % 2 == 0){
                System.out.println(num1);
            }
            num1++;
        }

        System.out.println();

        for(int num2 = 1; num2 <= 20; num2++){
            if(num2 % 2 == 0){
                System.out.println(num2);
                num2++;
            }
        }

        System.out.println();

        int num = 2;
        int count = 1;
        while(count <= 10){
            System.out.println(num);
            num+=2;
            count++;
        }
        System.out.println();

        for(int num3 = 2, count2 = 1; count2 <= 10;  num3 += 2, count2++){
            // for문 초기식에서 변수 여러개도 선언 가능함
            // 조건문 역시 여러 조건 사용 가능함
            System.out.println("num3 : " + num3);

        }

    }
}
