#include <stdio.h>
int main(){
	int a, b;
	int c, d, e;
	scanf("%d %d", &a, &b);
	c = b / 100;
	d = (b - 100 * c) / 10;
	e = (b - (100 * c + 10 * d));
	printf("%d\n", a * e);
	printf("%d\n", a * d);
	printf("%d\n", a * c);
	printf("%d", (a * c * 100) + (a * d * 10) + (a * e));
	return 0;
}
