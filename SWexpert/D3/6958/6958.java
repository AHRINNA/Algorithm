import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.valueOf(br.readLine());
        for(int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int max = 0;
            int cnt = 0;
            for(int j = 0; j < Integer.valueOf(s[0]); j++) {
                String[] str = br.readLine().split(" ");
                int temp = 0;
                for(int k = 0; k < str.length; k++) {
                    if (Integer.valueOf(str[k]) > 0) {
                        temp++;
                    }
                }
                if(temp > max) {
                    max = temp;
                    cnt = 1;
                }
                else if(temp == max) {
                    cnt++;
                }
            }
            sb.append("#" + (i + 1) + " " + cnt + " " + max);
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
