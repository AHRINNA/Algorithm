import java.util.Scanner;
 
public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t;
        t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int sum = 0;
            for(int j = 0; j < 10; j++){
                int p;
                p = scan.nextInt();
                if(p % 2 == 0)
                {
                }
                else
                    sum += p;
            }
            System.out.printf("#%d %d\n", i + 1, sum);
        }
    }
}
