import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // BaekJoon 9184

    // Memoization Dynamic Programming
    static int[][][] memoization = new int[51][51][51];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; ; i++) {
//            StringBuffer sb = new StringBuffer();
//            sb.append(br.readLine());
            String str = new String();
            str = br.readLine();
            if(str.equals("-1 -1 -1")) break;
            else {
                String[] strArray = str.split(" ");
                System.out.println("w(" + strArray[0] + ", " + strArray[1] + ", " + strArray[2] + ") = " + w(Integer.valueOf(strArray[0]), Integer.valueOf(strArray[1]), Integer.valueOf(strArray[2])));
            }
        }
    }

    static int w(int a, int b, int c) {
        if(a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        if(a > 20 || b > 20 || c > 20) {
            memoization[a][b][c] = w(20, 20, 20);
            return memoization[a][b][c];
        }

        if(memoization[a][b][c] != 0) return memoization[a][b][c];
        else {
            if (a < b && b < c) {
                memoization[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
            }
            else {
                memoization[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
            }
        }
        return memoization[a][b][c];
    }
}
