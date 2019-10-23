#include <iostream>
using namespace std;

int zcnt;
int ocnt;

int fibonacci(int n) {
    if (n == 0) {
        printf("0");
        zcnt++;
        return 0;
    } else if (n == 1) {
        printf("1");
        ocnt++;
        return 1;
    } else {
        return fibonacci(n‐1) + fibonacci(n‐2);
    }
}

int main(void){
    int test_case;
    cin >> test_case;
    for(int i = 0; i < test_case; i++){
        int a;
        cin >> a;
        zcnt = 0;
        ocnt = 0;
        fibonacci(a);
        cout << zcnt << " " << ocnt << endl;
    }
    
    return 0;
}
