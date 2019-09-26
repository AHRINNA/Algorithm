import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		for (int i = 0; i < T; i++) {
			String st[] = br.readLine().split(" ");
            int p = Integer.valueOf(st[0]);
            int q = Integer.valueOf(st[1]);
            int r = Integer.valueOf(st[2]);
            int s = Integer.valueOf(st[3]);
            int w = Integer.valueOf(st[4]);
            int aCharge, bCharge;
            aCharge = p * w;
            if(w < r) bCharge = q;
            else bCharge = q + (w - r) * s;
            System.out.printf("#%d %d\n", i+1, (aCharge > bCharge) ? bCharge : aCharge);
		}
	}
}

// 스캐너에서 오류 있어서 줄단위로 받아와서 split으로 쪼개서 줄단위 핸들링
