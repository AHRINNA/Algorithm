#include <stdio.h>

void fill(int n) // hint에 있는 2차원 배열에 채워넣는 함수. 내부에 2차원 배열을 동적으로 선언하고(done), 2차원 배열을 위치에 맞게 출력하는 출력문 필요
{
     int x = 1;                    // 행 - 처음에는 1 
     int y = n / 2 + 1;            // 열 - 초기값 중앙
     int i;                        // 배열에 순서대로 채울 값 (for 문에 사용할 변수)
     int j;
     int end = n * n;              // 배열에 채울 마지막 값
     int row, col;
     row = n;
     col = n;
     int** arr = (int**)malloc(row * sizeof(int*));
     for(i = 0; i < row; i++){
          arr[i] = (int*)malloc(col * sizeof(int*));
     }
     for (i = 1; i <= end; i++) {  // 배열에 채울 값 1부터 end까지
         arr[x][y] = i;            // i를 배열의 현재 위치에 넣는다.
         if (i % n == 0) {         // 만약 현재의 수가 n의 배수이면 아래로 이동
             x++;                 
         }
         else {
             x--, y--;             // 왼쪽 위로 이동
             if (x < 1) x = n;     // x가 0이면 n으로
             if (y < 1) y = n;     // y가 0이면 n으로
         }
     }
}
/*  hint에 있는 재귀함수. 재귀함수 분석
void fill(int x, int y, int num)
{
    if(num > n * n) return;                     // 수가 범위를 벗어나면 종료
    if(x < 1) x = n;                              // x가 0이면 n으로
    if(y < 1) y = n;                              // y가 0이면 n으로
    arr[x][y] = num;                             // 배열 채우기
    if(num % n == 0) fill(x + 1, y, num + 1);    // num이 n의 배수이면 바로 아래 호출
    else fill(x - 1, y - 1, num + 1);             // 아니면 왼쪽 위 호출 
}
위의 fill을 재귀로 처리하는 방식의 함수, 시작점을 x, y의 매개변수로 날리고 홀수를 매개변수 n으로, num이 현재 값.
매개변수 num을 n으로 고치고, 처음 값을 num에 넣는 코드가 필요. 메인에서 호출시엔 무조건 x는 1, y는 2값을 전달인자로 넣어야한다
*/

int main(void){
int e;
while(true){ // 2부터 100 사이의 홀수인지 여부 확인해서 아니면 다시 입력, 맞으면 입력 끝
scanf("%d", &e);
if((e % 2 == 1) && e > 2 && e < 100) break;
}

fill(e);

return 0;
}
