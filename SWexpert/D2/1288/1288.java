import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.valueOf(br.readLine());
        int t;
        for (int i = 0; i < testCase; i++) {
            t = Integer.valueOf(br.readLine());
            int originT = t;
            int temp;
            int cnt = 1;
            Map<Integer, Integer> g = new HashMap<>();
            for (int j = 0; j <= 9; j++) {
                g.put(j, g.getOrDefault(t, 0) + 1);
            }
            temp = t;
            do {
                if (g.get(temp % 10) != null) {
                    g.remove(temp % 10);
                }
                temp = temp / 10;
                if (temp != 0) {
                    continue;
                } else if (g.size() != 0) {
                    cnt++;
                    t = originT * cnt;
                    temp = t;
                }
            }
            while (g.size() != 0);
            System.out.println("#" + (i + 1) + " " + t);
        }

//    private static int checkUnitPlace(int a) {
//        if(a / 10 != 0) {
//            checkUnitPlace(a / 10);
//        }
//        return a;
//    }
    }
}
