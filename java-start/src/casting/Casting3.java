package casting;

public class Casting3 {

    public static void main(String[] args) {
        // 캐스팅 오버플로우

        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int  + 1(초과)
//        long intOverflow = 2147483648; //Integer number too large 오류 발생
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " +maxIntOver);
        // 원래 -2147483648 로 출력돼야 함
        // 실행 논리
        // intValue = (int) maxIntOver; //변수 값 읽기 시도
        // intValue = (int) 2147483648L; //형변환 시도
        // intValue = -2147483648
        // int형은 2147483648L을 표현할 방법이 없으므로, 처음 초과시 그 값에 -가 붙는 형태로 출력됨
        // 이런 것을 오버플로우라고 함

        // 참고로 -2147483648 는 int의 가장 작은 숫자임

        // 오버플로우 자체가 발생하지 않도록 하여야하고, 발생하였다면 더 큰 타입으로 형 변환 해서 오버플로우 문제 해결





    }
}
