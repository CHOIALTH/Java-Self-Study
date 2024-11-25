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

        intValue = (int) 2147483648L;
        System.out.println("maxIntOver casting = " +maxIntOver);


    }
}
