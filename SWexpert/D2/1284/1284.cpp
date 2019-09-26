#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    
    // 삼항연산자는 if같은 논리식이 들어갈 수 없다 ((W * P) > (if(W <= R){return Q} else{return (W-R)*S +Q})) ? (W * P) : (if(W <= R){return Q} else{return (W-R)*S +Q}))
    
    for(int i = 0; i < T; i++){        
        int P, Q, R, S, W, sd;
    	cin >> P;
    	cin >> Q;
    	cin >> R;
    	cin >> S;
    	cin >> W;
        int aCharge, bCharge;
    	aCharge = P * W;
    	if(W < R){
	        bCharge = Q;
	    }
	    else
	    {
	        bCharge = Q + (W-R) * S;
	    }
	    (aCharge > bCharge) ? sd = bCharge : sd = aCharge;
        cout << "#" << i+1 << " " << sd << endl;
    }
    return 0;
}
