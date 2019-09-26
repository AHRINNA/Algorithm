#include <iostream>
using namespace std;

int main(void){
    int sum = 0;
    int n= 0;
    cin >> n;
    while(true){
        if(n >= 1 && n <= 9999)
        {
            break;
        }
        else
        {
            cout << "입력값이 잘못되었습니다. 1~9999 사이의 자연수 하나를 입력하세요 >>";
            cin >> n;
        }
    }
    int a = 0;
    int b = 0;
    int c = 0;
    if(n >999)
    {
        a = n / 1000;
        n = n -(a*1000);
    }
    if(n > 99)
    {
        b = n / 100;
        n = n-(b*100);
    }
    if(n > 9)
    {
        c = n / 10;
        n -= c*10;
    }
    sum += n;
    sum += c;
    sum += b;
    sum += a;
    cout << sum;
    return 0;
}
