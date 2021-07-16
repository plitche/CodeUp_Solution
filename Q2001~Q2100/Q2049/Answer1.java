package Q2049;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2049
//@Memory 11180, @Time 69
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int[][] arr = new int[4][4];
        for (int i=0; i<4; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<4; j++) {
        		arr[i][j]+=Integer.parseInt(st.nextToken());
        	}
        }
        
        for (int i=0; i<4; i++) {
        	for (int j=0; j<4; j++) {
    			if (arr[i][j]==0 && i<3) {
    				arr[i][j] = arr[i+1][j];
    				arr[i+1][j] = 0;
    			}
        	}
        }
        
        for (int i=0; i<4; i++) {
        	for (int j=0; j<4; j++) {
                if (i<3) {
        			if (arr[i][j] == arr[i+1][j]) {
        				arr[i][j] = arr[i][j]+arr[i+1][j];
        				arr[i+1][j] = 0;
        			}
        		}
        	}
        }
        
        for (int i=0; i<4; i++) {
        	for (int j=0; j<4; j++) {
    			if (arr[i][j]==0 && i<3) {
    				arr[i][j] = arr[i+1][j];
    				arr[i+1][j] = 0;
    			}
        		sb.append(arr[i][j]).append(" ");
        	}
        	sb.append("\n");
        }
        
    	System.out.println(sb);	
	}
}