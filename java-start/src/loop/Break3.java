package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i= 1; ; i++) {
            sum += i;

            if (sum > 10) {
                System.out.println("총합 10 초과! i = " + i + ", sum = " + sum);
                break;
            }
        }
    }
}
