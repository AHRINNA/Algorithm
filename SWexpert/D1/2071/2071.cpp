#include <iostream>
#include <iomanip> // setprecision을 사용하기 위한 
using namespace std;

int main(void){
    int t, sum;
    float avg;
    cin >> t;
    for(int i = 0; i < t; i ++)
    {
        avg = 0;
        sum = 0;
        for(int j = 0; j < 10; j++)
        {
            cin >> sum;
            avg += sum; 
        }
        avg = avg / 10;
        cout << "#" << i+1 << " " << fixed << setprecision(0) << avg << endl;
    }
    return 0;
}
