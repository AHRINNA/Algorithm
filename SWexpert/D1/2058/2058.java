import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        while(true){
            if(n >= 1 && n <= 9999)
                break;
            else
            {
                System.out.print("잘못된 값을 입력하였습니다. 1~9999 중의 자연수를 입력하세요 >>");
                n = scan.nextInt();
            }
        }
        int a = 0;
        int b = 0;
        int c = 0;
        if(n > 999){
            a = n / 1000;
            n -= a*1000;
        }
        if(n > 99){
            b = n / 100;
            n -= b*100;
        }
        if(n > 9){
            c = n / 10;
            n -= c*10;
        }
        sum += n;
        sum += c;
        sum += b;
        sum += a;
        System.out.println(sum);
    }
}
