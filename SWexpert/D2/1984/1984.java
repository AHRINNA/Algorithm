import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        int t;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        int[] arr = new int[10];
        int min, max, sum;
        for(int i = 0; i < t; i++){
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            sum = 0;
            for(int j = 0; j < 10; j++){
                arr[j] = s.nextInt();
                if(arr[j] > max){
                    max = arr[j];
                }
                if(arr[j] < min){
                    min = arr[j];
                }
                sum += arr[j];
            }
            System.out.printf("#%d %.0f\n", i+1, (sum - max - min) / 8.0f);
        }
    }
}
