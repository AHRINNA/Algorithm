#include <iostream>
using namespace std;

int main(void){
    int n;
    cin >> n;
    for(int i = 1; i <= n; i++){
        if((n % i) == 0)
            cout << i << " ";
    }
}
/*
n을 입력받고 n까지 약수를 
*/
