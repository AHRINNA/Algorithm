import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.valueOf(br.readLine());
        for(int i = 0; i < testCase; i++) {
            String s = br.readLine();
            String year = s.substring(0, 4);
            String month = s.substring(4, 6);
            String day = s.substring(6);
            if(Integer.valueOf(month) >= 1 && Integer.valueOf(month) <= 12) {
                if(Integer.valueOf(month) == 2) {
                    if(February.feb(day)) {
                        System.out.printf("#%d %s/%s/%s\n", i + 1, year, month, day);
                    }
                    else {
                        System.out.printf("#%d %d\n", i + 1, -1);
                    }
                }
                if(Integer.valueOf(month) == 1 || Integer.valueOf(month) == 3 || Integer.valueOf(month) == 5 || Integer.valueOf(month) == 7 || Integer.valueOf(month) == 8 || Integer.valueOf(month) == 10 || Integer.valueOf(month) == 12) {
                    if(oddDays.thirtyOne(day)) {
                        System.out.printf("#%d %s/%s/%s\n", i + 1, year, month, day);
                    }
                    else {
                        System.out.printf("#%d %d\n", i + 1, -1);
                    }
                }
                if(Integer.valueOf(month) == 4 || Integer.valueOf(month) == 6 || Integer.valueOf(month) == 9 || Integer.valueOf(month) == 11 ) {
                    if(evenDays.thirty(day)) {
                        System.out.printf("#%d %s/%s/%s\n", i + 1, year, month, day);
                    }
                    else {
                        System.out.printf("#%d %d\n", i + 1, -1);
                    }
                }
            }
            else {
                System.out.printf("#%d %d\n", i + 1, -1);
            }
        }
    }
}

class February {
    public static boolean feb(String day) {
        if(Integer.valueOf(day) <= 28 && Integer.valueOf(day) > 0) {
            return true;
        }
        else
            return false;
    }
}

class oddDays {
    public static boolean thirtyOne(String day) {
        if(Integer.valueOf(day) <= 31 && Integer.valueOf(day) > 0) {
            return true;
        }
        else
            return false;
    }
}

class evenDays {
    public static boolean thirty(String day) {
        if(Integer.valueOf(day) <= 30 && Integer.valueOf(day) > 0) {
            return true;
        }
        else
            return false;
    }
}
