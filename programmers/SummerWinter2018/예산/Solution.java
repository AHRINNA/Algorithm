import java.util.Arrays;

class Solution {
  public int solution(int[] d, int budget) {
      
      int answer = 0;
      /*
      for(int i = 0; i < d.length-1; i++) {
          for(int j = 0; j < d.length-i-1; j++) {
              if(d[j] > d[j+1]) {
                  int temp = d[j];
                  d[j] = d[j+1];
                  d[j+1] = temp;
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
