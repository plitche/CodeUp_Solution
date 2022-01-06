package Q2602;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2602
//@Memory 11216, @Time 67
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int[][] arr = new int[4][4];
        for (int i=0; i<3; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<3; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        arr[0][3] = arr[0][0] + arr[0][1] + arr[0][2]; 
        arr[1][3] = arr[1][0] + arr[1][1] + arr[1][2]; 
        arr[2][3] = arr[2][0] + arr[2][1] + arr[2][2]; 
        
        arr[3][0] = arr[0][0] + arr[1][0] + arr[2][0]; 
        arr[3][1] = arr[0][1] + arr[1][1] + arr[2][1]; 
        arr[3][2] = arr[0][2] + arr[1][2] + arr[2][2];
        
        arr[3][3] = arr[0][3] + arr[1][3] + arr[2][3]; 
        
        for (int[] i : arr) {
        	for (int j : i) {
        		sb.append(j).append(" ");
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
	}
    	 
}

