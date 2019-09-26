#include <iostream>
#include <cstdio>
using namespace std;

int main(void){
    int t;
    cin >> t;
    int min, max, sum;
    int arr[10] = {};
    
    for(int i = 0; i < t; i++){
        min = 10000;
        max = 0;
        sum = 0;
        for(int j = 0; j < 10; j++){
            cin >> arr[j];
            if(arr[j] > max){
                max = arr[j];
            }
            if(arr[j] < min){
                min = arr[j];
            }
            sum += arr[j];
        }
        printf("#%d %.0f\n", i+1, (sum - max - min) / 8.0);
    }
    return 0;
}
