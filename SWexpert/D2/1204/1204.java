import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int testCase = Integer.valueOf(br.readLine());
        for(int i = 0; i < testCase; i++) {
            int T = Integer.valueOf(br.readLine());
            String[] s = br.readLine().split(" ");
            Map<String, Integer> inData = new HashMap<>();
            for(int j = 0; j < s.length; j++) {
                inData.put(s[j], inData.getOrDefault(s[j], 0) + 1);
            }
//            Iterator it = inData.keySet().iterator(); Iterator로 key값 가져와서 사용하기
            int maxData = 0, tempMax = 0, tempValue = 0, maxValue = 0;
//            for(Map.Entry<String, Integer> key : inData.entrySet()) {
//              entrySet으로 key value값 째로 가져와서 쓰기
//            }
            for(String keys : inData.keySet()) { // key만 가져와서 쓰기
                if(inData.get(keys) >= tempValue) {
                    tempMax = Integer.valueOf(keys);
                    tempValue = inData.get(keys);
                }
                if(tempValue > maxValue) {
                    maxData = tempMax;
                    maxValue = inData.get(keys);
                }
                else if(tempValue == maxValue) {
                    if(tempMax > maxData) {
                        maxData = tempMax;
                    }
                }
            }
//            while(it.hasNext()) {
//                (inData.get(it.next()) > tempMax ? tempMax = it.next() : tempMax > maxData ? maxData = tempMax;
//                }
            System.out.printf("#%d %d\n", T, maxData);
        }
    }
}
