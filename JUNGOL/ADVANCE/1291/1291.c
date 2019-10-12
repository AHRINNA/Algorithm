#include <stdio.h>

int main(void) {
	int s, e;

	while (true) {
		scanf("%d", &s);
		if (s < 2 || s > 9) {
			cout << "INPUT ERROR!" << endl;
			continue;
		}
		else
			break;
	}
	while(true){

		scanf("%d", &e);
		if (e < 2 || e > 9) {
			cout << "INPUT ERROR!" << endl;
			continue;
		}
		else
			break;
	}

	if (s > e) {
  int i, int j;
		for (i = s; i >= e; i--) {
			for (j = 1; j < 10; j++) {
				printf("%d * %d = %2d   ", i, j, i * j);
			}
		}
	}
	else {
  int i, int j;
		for (i = s; i <= e; i++) {
			for (j = 1; j < 10; j++) {
				printf("%d * %d = %2d   ", i, j, i * j);
			}
		}
	}


	return 0;
}
