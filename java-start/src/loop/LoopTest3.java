package loop;

public class LoopTest3 {
    public static void main(String[] args){

        int i = 1;
        int max = 100;
        int sum = 0;

//        while(i <= max){
//            sum = sum + i;
//            if(i == max){
//                System.out.println( max + "까지의 합 :" + sum);
//            }
//            i++;
//        }
        while(i <= max){
            sum = sum + i;
            i++;
        }
        System.out.println( max + "까지의 합:" + sum);

        System.out.println();

        int sum2 = 0;
        int max2 = 10;
        for(int j = 1; j <= max2; j++){
            sum2 += j;
        }
        System.out.println( "합:" + sum2);

    }
}
