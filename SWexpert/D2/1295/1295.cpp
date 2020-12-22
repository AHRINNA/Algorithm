#include <iostream>
#include <cmath>
using namespace std;

// 파일입출력 문제
// sizeof를 이용해 고정배열 1000이 아니라 유동배열을 할당할 수는 없나?

int main(void){
    int T;
    cin >> T;
    for(int i = 0; i < T; i++) {
        int n;
        cin >> n;
        int distance = 0, num = 0, temp = 100001;
        for(int j = 0; j < n; j++) {
            int tempDis;
            cin >> tempDis;
            tempDis = abs(tempDis);
            if(tempDis < temp) {
                temp = tempDis;
                distance = temp;
                num = 1;
            }
            else if(tempDis == temp) {
                num++;
            }
        }
        cout << "#" << (i + 1) << " " << distance << " " << num << "\n";
    }
}
    /*
    int t;
    cin >> t;
    int n;
    cin >> n;
    for(int i = 0; i < t; i++)
    {
    	int peoples[1000]={0};
    	int best = 100001;
    	for(int i = 0; i < n; i++){
	        cin >> peoples[i];
	        cout << peoples[i] << endl;
	    }
	    int count = 1;
	    for(int i = 0; i < n; i++){
	        if(fabs(peoples[i]) < fabs(best))
	        {
	            best = peoples[i];
	        }
	        else if(fabs(peoples[i]) == fabs(best))
	        {
	            count++;
	        }
	    }
	    cout << "#" << t << " " << best << " " << count << endl;
	    }*/
