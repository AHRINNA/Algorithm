#include <stdio.h>

int main(void){
int a, b, c, d;
scanf("%d %d", &a, &b);
if(a == b)
c = 1;
else
c = 0;

if(a != b)
d = 1;
else
d = 0;

printf("%d\n", c);
printf("%d", d);

}
