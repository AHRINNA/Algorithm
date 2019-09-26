#include<iostream>
using namespace std;

int main(void){
    int t;
    cin >> t;
    
    for(int i = 1; i <= t; i++)
    {
        int sum = 0;
        for(int j = 1; j <= 10; j++)
        {
            int p[10] = {};
            cin >> p[j-1];
            if((p[j-1] % 2) == 0)
            {
            }
            else
                sum += p[j-1];
        }
        cout << "#" << i << " " << sum << "\n";
    }
}
