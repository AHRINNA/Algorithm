#include <iostream>
using namespace std;

int n;
cin >> n;
int a[n];
int b[n];
for(int i = 0; i < n; i++){
    cin >> a[i]; // a[]에 변수 n개를 넣기
}
for(int i = 0; i < n; i++){
    cin >> b[i]; // b[]에 변수 n개를 넣기
}
int c[n];
for(int i = 0; i < n; i++){
    for(int j = i + 1; j < n; j++){
        if(b[i] < b[j]){ // b[i]가 b[i+1~n]까지보다 작을때마다 n에서 1씩 빼서 저장해서 b[i]가 몇번째로 큰 수인지
            c[i] = n - 1;
        }
    }
for(int i = 0; i < n; i++){
    for(int j = i + 1; j < n; j++){
        if(a[i] < a[j]){ // a[i]가 a[i+1~n]까지보다 작을때마다 
            c[i] = n - 1;
        }
    }
}
