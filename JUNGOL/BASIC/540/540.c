#include <stdio.h>

int main(void){
int a;
for(;;){
scanf("%d", &a);
if(a == -1) break;
else if((a % 3) == 0) printf("%d\n", a / 3);
}

return 0;
}
