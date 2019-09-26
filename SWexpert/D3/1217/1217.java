// 버퍼로 불러와서 라인별로 읽어서 뜯는 부분에서 메모리 오버플로우 발생
/* (Runtime error)
Error Message:
Memory error occured, (e.g. segmentation error, memory limit Exceed, stack overflow,... etc) */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution{
    static int z;
    public static int xtimes(int n, int m){
        z *= n;
        if(m > 1) {
            xtimes(n, m-1);
        }
        return z; // cpp와 차이점이 있다. cpp에서는 else로만 하여 return을 두면 그 아래 return 이 생략된 값이 있다고 컴파일러가 인식하지만 java에서는 아니다
        // else를 쓰려면 else return; 아래 return z;를 
    }
    
    public static void main(String[] args)/* throws IOException */{
        // BufferedReader br;
    	Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
        	// br = new BufferedReader(new InputStreamReader(System.in));
            // String s = br.readLine();
        	int s = sc.nextInt();
            System.out.print("#" + s + " ");
            int n, m;
            /* s = br.readLine();
            String[] sr = s.split("");
            n = Integer.valueOf(sr[0]);
            m = Integer.valueOf(sr[2]);
            */
            n = sc.nextInt();
            m = sc.nextInt();
            z = n;
            System.out.println(xtimes(n, m-1));
            // br.close();
        }
        sc.close();
    }
}
