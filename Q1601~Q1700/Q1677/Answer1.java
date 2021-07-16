package Q1677;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1677
//@Memory 11096, @Time 정답

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int width = Integer.parseInt(st.nextToken());
        int height= Integer.parseInt(st.nextToken());
        		
        char[][] arr = new char[height][width];
        for (int i=0; i<height; i++) {
        	for (int j=0; j<width; j++) {
        		if ( (i==0 || i==height-1) && (j==0 || j==width-1) ) {
        			arr[i][j] = '+'; 	
        		} else if (i==0 || i==height-1) { 
        			arr[i][j] = '-';
        		} else if (j==0 || j==width-1) {
        			arr[i][j] = '|';
        		} else {
        			
        		}
        	}
        }
        
        for (char[] i : arr) {
        	for (char j : i) {
        		sb.append(j);
        	}
        	sb.append("\n");
        }
	
        System.out.println(sb);
    }
    	 
}