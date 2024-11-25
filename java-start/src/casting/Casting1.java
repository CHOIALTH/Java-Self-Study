package casting;

public class Casting1 {

    public static void main(String[] args) {
        // 형변환(casting)
        // 자동 형변환(= 묵시적 형변환)

        // 자바에서 숫자 표현 범위 : int < long < double
        // 작은범위에서 큰 범위의 값을 대입하는 것은 문제 없음
        // -> 쉽게 이야기하자면, 큰 그릇에는 작은 그릇에 담긴 내용 담을 수 있음

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);
        // 실제 논리는 다음과 같은 순서다.
        // doubleValue = intValue
        // doubleValue = (double) intValue //형 맞추기
        // doubleValue = (double) 10 //변수값 읽기
        // doubleValue = 10.0 //형 변환




        doubleValue = 20L; // long(L 붙였으니 Long 형) -> double;
        System.out.println("doubleValue2 = " + doubleValue);

    }
}
