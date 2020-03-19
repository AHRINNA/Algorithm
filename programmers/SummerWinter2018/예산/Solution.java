import java.util.Arrays;

class Solution {
  public int solution(int[] d, int budget) {
      
      int answer = 0;
      /*
      for(int i = 0; i < d.length - 1; i++) {
          for(int j = 1; j < d.length; j++) {
              if(d[i] > d[j]) {
                  int temp = d[i];
                  d[i] = d[j];
                  d[j] = temp;
              }
          }
      } // 정렬완료
      */
      Arrays.sort(d);
      
      int sum = 0;
      for(int i = 0; i < d.length; i++) {
          sum += d[i];
          answer = i+1;
          if(sum > budget) {
              answer--;
              break;
          }
      }
      return answer;
  }
}
