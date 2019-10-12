#include <iostream>
using namespace std;

int main(void) {
	int s, e;

	while (true) {
		cin >> s;
		if (s < 2 || s > 9) {
			cout << "INPUT ERROR!" << endl;
			continue;
		}
		else
			break;
	}
	while(true){

		cin >> e;
		if (e < 2 || e > 9) {
			cout << "INPUT ERROR!" << endl;
			continue;
		}
		else
			break;
	}

	if (s > e) {
		for (int i = s; i >= e; i--) {
			for (int j = 1; j < 10; j++) {
				cout << j << ' * ' << i << ' = ';
				printf("%2d   ", i * j);
			}
		}
	}
	else {
		for (int i = s; i <= e; i++) {
			for (int j = 1; j < 10; j++) {
				cout << j << ' * ' << i << ' = ';
				printf("%2d   ", i * j);
			}
		}
	}


	return 0;
}
