package Q2608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2607
//@Memory 15180, @Time 3988
public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int people = Integer.parseInt(br.readLine());
        
        String[] arr = new String[people];
        for (int i=0; i<people; i++) {
        	arr[i] = "O";
        }
        
        for (int i=0; i<people; i++) {
        	for (int j=0; j<i-1; j++) {
        		if (j==0) {
    				arr[j] = "X";	
    			} else {
    				arr[j] = "O";
    			}
        		
        		for (int k=0; k<2; k++) {
        			if (k==0) {
        				arr[i] = "X";	
        			} else {
        				arr[i] = "O";
        			}
        		}
        	}
        }
        
        
        System.out.print(sb);
	}
    	 
}

