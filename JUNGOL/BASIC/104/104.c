#include <stdio.h>

int sum(int a, int b, int c){
return a + b + c;
}

int avg(int a, int b, int c){
return (a + b + c) / 3;
}

int main(void){
int kor;
int mat;
int eng;
kor = 90;
mat = 80;
eng = 100;

printf("kor %d\nmat %d\neng %d\nsum %d\navg %d\n", kor, mat, eng, sum(kor, eng, mat), avg(kor, eng, mat));
return 0;
}
