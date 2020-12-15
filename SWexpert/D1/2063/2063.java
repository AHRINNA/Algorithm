import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.valueOf(br.readLine());
        String[] sr = new String[size];
        sr = br.readLine().split(" ");
        int[] intSr = new int[size];
        for(int i = 0; i < sr.length; i++) {
            intSr[i] = Integer.valueOf(sr[i]);
        }
//        for(int i = 0; i < intSr.length; i++) {
//            for(int j = i + 1; j < intSr.length; j++) {
//                if(intSr[i] > intSr[j]) {
//                    swap(intSr[i], intSr[j]);
//                }
//            }
//        }
        Arrays.sort(intSr);
        System.out.println(intSr[intSr.length / 2]);
    }

//    public static void swap(int a, int b) {
//        int temp = a;
//        b = a;
//        a = temp;
//    }
}
