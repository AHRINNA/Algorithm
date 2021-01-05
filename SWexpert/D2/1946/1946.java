import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] s = new String[2];
        StringBuilder st = new StringBuilder();
        int T = Integer.valueOf(br.readLine());
        int N, l;
        for (int i = 0; i < T; i++) {
            N = Integer.valueOf(br.readLine());
            l = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 10; k++) {
                    if (l == 0) {
                        if((j + 1) == N) {
                            break;
                        }
                        s = br.readLine().split(" ");
                        st.setLength(0);
                        st.append(s[0]);
                        l = Integer.valueOf(s[1]);
                    }
                    sb.append(st);
                    l--;
                }
                sb.append("\n");
            }
            System.out.println("#" + (i + 1) + " " + "\n" + sb);
            sb.setLength(0);
        }
    }
}
