package casting;

public class Casting4 {

    public static void main(String[] args) {
        // 자바에서의 계산과 형변환
        // 1. 같은 타입끼리의 계산은 같은 타입의 결과를 냄
        // 2. 서로 다른 타입끼리의 계산은 더 큰 타입으로 자동 형변환 됨


        int div1 = 3/2; // 1.5
        System.out.println("div1 = " + div1);

        double div2 = 3/2;
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2; //명싲거 형변환 사용
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / 2;
        System.out.println("result = " + result);
    }
}
