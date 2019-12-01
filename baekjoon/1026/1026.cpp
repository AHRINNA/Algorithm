#include <iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
    int a[n]; // 0~n-1까지의 배열들 생성
    int b[n];
    int s = 0;
    for(int i = 0; i < n; i++){
        cin >> a[i]; // a[0~n-1]에 변수 n개를 넣기
    }
    for(int i = 0; i < n - 1; i++){ // 버블정렬
        for(int j = i + 1; j < n; j++){
            if(a[i] > a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    for(int i = 0; i < n; i++){
        cin >> b[i]; // b[0~n-1]에 변수 n개를 넣기
    }
    int c[n]; // b[i]번째가 몇번째로 큰수인지 c[i]에 값 담기
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(b[i] < b[j]){ // b[i]가 b[i~n]보다 작을때마다 n에서 1씩 빼서 저장해서 b[i]가 몇번째로 큰 수인지
                c[i] = n - 1;
            }
        }
    }
    for(int i = 0; i < n; i++){
        int t = c[i] - 1;
        /* c[0~n]까지의 숫자크기대로 a[] 배열. ex, c[]가 5 2 3 1 4면 a[4] a[1] a[2] a[0] a[3] */
        c[i] = a[t];
    }
    for(int i = 0; i < n; i++){
        s += a[i] * b[i];
    }
    cout << s;
}
