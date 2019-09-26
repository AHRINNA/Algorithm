import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        int t, sum;
        float avg;
        // int[] n = new int[10]; // sum으로 활용해버리는게 메모리적으로는 4kb씩 9개 더 이득
        Scanner scan = new Scanner(System.in);
        t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            avg = 0;
            sum = 0;
            for(int j = 0; j < 10; j++)
            {           
                // n[i] = scan.nextInt();
                sum = scan.nextInt();
                avg += sum;
            }
            avg = avg / 10;               
            System.out.printf("#%d %d\n", i+1, Math.round(avg));
        }
    }
}
