package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (; ; ) {
            sum += i;
            if (sum > 10) {
                System.out.println("총합 10 초과! i = " + i + ", sum = " + sum);
                break;
            }
            i++;
        }
    }
}
