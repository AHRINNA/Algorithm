import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
  
 public class Solution{
              
        public int[] input(String strNum){
            String[] str = strNum.split("\\s");
            int[] num = new int[2];
            for(int i = 0; i <str.length; i++){
                num[i] = Integer.parseInt(str[i]);
            }
            return num;
        }
         
         public int power(int num, int cnt){
            if(cnt == 0){
                return 1;
            }
            return num*power(num, cnt-1);
         }
  
        public static void main(String[] arsgs) throws IOException{
            Solution sol = new Solution();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            for ( int i = 0; i < 10; i++){//test
                int testNum = Integer.parseInt(bf.readLine());
                String str = bf.readLine();
                int[] num = sol.input(str); 
                int res =sol.power(num[0], num[1]);
                System.out.println("#"+testNum+" "+res);
             }//for i
         }//main
 }
