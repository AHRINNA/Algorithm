#include <stdio.h>

int main(){
	int a;
	// int *b;
	scanf("%d", &a);
	// *b = &a;
	printf("%#p %d", a, a);
	return 0;
}

/*

%p is a format specifier to print a pointer in printf, or sprintf.
%p는 printf나 scanf시 포인터(변수의 주소)를 출력하는 
