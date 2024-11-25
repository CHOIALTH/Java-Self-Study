package scope;

public class Scope1 {
    public static void main(String[] args){
        // 좋은 코드는 군더더기가 없는 코드이다.
        // 좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라, 적절한 제약이 있는 프로그램이다!
        int m = 10;

        while (m > 0){
            int temp = m * 2;
            System.out.println("temp : " + temp);
            break;
        }
        System.out.println("m : " + m);
    }
}
