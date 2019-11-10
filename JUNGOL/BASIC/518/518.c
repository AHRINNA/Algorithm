#include <stdio.h>
int sum(int a, int b, int c);
int avg(int a, int b, int c);
int main(){
int a;
int b;
int c;
scanf("%d %d %d", &a, &b, &c);
printf("sum : %d\navg : %d\n", sum(a, b, c), avg(a, b, c));

return 0;
}

int sum(int a, int b, int c){
return a + b + c;
}

int avg(int a, int b, int c){
return (a + b + c) / 3;
}
