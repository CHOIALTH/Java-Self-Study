package scope;

public class Scope1 {
    public static void main(String[] args){
        // 좋은 코드는 군더더기가 없는 코드이다.
        // 좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라, 적절한 제약이 있는 프로그램이다!

        // 스코프? 변수의 생존범위라고 생각하자

        int m = 10; // 지역변수

        while (m > 0){
            int temp = m * 2;
            System.out.println("temp : " + temp);
            break;
        }
        System.out.println("m : " + m);

        // while문, for문 관점에서의 스코프
        // while문은 변수 선언을 자체적으로 할 수 없다.
        // 반면 for문은 자체 내에서 변수를 선언할 수 있어, for문 내에서만 변수를 사용하고 끝낼 수 있다.
        // 따라서 for문 안에서만 사용되는 카운터 변수 i가 있다, while문에서보다 for문에서 스코프의 범위를 제한하여,
        // 메모리의 사용 효율을 높일 수 있고, 유지보수 관점에서 더 좋다
    }
}
