#include <iostream>
using namespace std;
static int z;
int xtimes(int n, int m) {
    z *= n;
    if(m > 1)
        xtimes(n, m-1);
    else
        return z; // java와 결정적으로 다른 코드. 왜 그런가? 
    // 여기에 return 0; 이 생략되어 있는데 컴파일러가 처리해준다. java는 
}

int main(void){
    int n, m, t;
    for(int i = 0; i < 10; i ++){
        cin >> t;
        cin >> n;
        cin >> m;
        z = n;
        cout << "#" << t << " " << xtimes(n, m-1) << endl;
    }
    return 0;
}
