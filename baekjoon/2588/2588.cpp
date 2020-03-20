#include <iostream>
using namespace std;
int main() {
    int a, b, c, d;
    cin >> a >> b;
    d = a * b;
    for(int i = 0; ; i++) {
        c = b % 10;
        b /= 10;
        cout << a * c << "\n";
        if(b < 1)
            break;
    }
    
    cout << d;
    return 0;
}

// 이하 실패코드. 왜 실패?
/*
#include <iostream>
using namespace std;
int main() {
    int a, b, c, d;
    cin >> a >> b;
    d = a * b;
    do {
        c = b % 10;
        b /= 10;
        cout << a * c << "\n";
    } while(b > 2);
    cout << d;
    return 0;
}
