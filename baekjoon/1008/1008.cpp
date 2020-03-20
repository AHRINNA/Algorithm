#include <iostream>
using namespace std;
int main() {
    double a, b;
    cin >> a >> b;
    cout.precision(10); // 소수점 최대 자릿수 지정
    cout << a / b;
    return 0;
}

/*
cout.setf(ios::fixed);
소수점 자릿수 고정시키기

cout.unsetf(ios::fixed);
고정 해제

https://blog.naver.com/noksek0615/221678831112
