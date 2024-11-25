package casting;

public class Casting2 {

    public static void main(String[] args) {
        // 명시적 형변환
        // 큰 범위에서 작은 범위 대입은 명시적 형변환이 필요함 -> 명시적 형변환이 없을 경우 컴파일 오류 발생함
        // ex) java: incompatible types: possible lossy conversion from double to int

        double doubleValue = 10.3;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println("intValue : " + intValue);
        // 실제 논리는 다음과 같은 순서다.
        // intValue = (int) doubleValue;
        // intValue = (int) 10.3;
        // intValue = 10;

        System.out.println(10.5);
        System.out.println((int)10.5);


    }

}
