#include <stdio.h>

int main(){
	int a, b;
	int sum;
	sum = 0;
	scanf("%d %d", &a, &b);
	if(a > b){
		for(int i = b; i <= a; i++){
			sum += i;
		}
	}
	else{
		for(int i = a; i <= b; i++){
			sum += i;
		}
	}
	printf("%d", sum);
	return 0;
}
