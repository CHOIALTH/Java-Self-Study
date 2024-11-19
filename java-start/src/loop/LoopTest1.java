package loop;

public class LoopTest1 {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        System.out.println(); // 라인 구분 목적

        for (int count2 = 1; count2 <= 10; count2++) {
            System.out.println(count2);
        }
    }
}
