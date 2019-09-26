#include <iostream>
using namespace std;

int main(void){
    int t, m;
    cin >> t;
    
    for(int j = 0; j < t; j++){
        m = 0;
	    for(int i = 0; i < 10; i++){
            int temp;
            cin >> temp;
            ( m > temp ) ? m : ( m = temp );
    	}
        cout << "#" << j + 1 << " " << m << endl;
    }
    return 0;
}
