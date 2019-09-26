import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        int t, m;
        Scanner s = new Scanner(System.in);
    	t = s.nextInt();
    
    	for(int j = 0; j < t; j++){
        	m = 0;
	    	for(int i = 0; i < 10; i++){
	            int temp;
	            temp = s.nextInt();
                if(m < temp){
                    m = temp;
                }
	    	}
	        System.out.printf("#%d %d\n", j+1, m);
	    }
    }
}
