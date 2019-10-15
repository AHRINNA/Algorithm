#include <stdio.h>
// 삼항연산자 활용
int main(void){
int a, b;
scanf("%d %d", &a, &b);
printf("%d > %d --- %d\n", a, b, a > b ? 1 : 0);
printf("%d < %d --- %d\n", a, b, a < b ? 1 : 0);
printf("%d >= %d --- %d\n", a, b, a >= b ? 1 : 0);
printf("%d <= %d --- %d\n", a, b, a <= b ? 1 : 0);
return 0;
}
