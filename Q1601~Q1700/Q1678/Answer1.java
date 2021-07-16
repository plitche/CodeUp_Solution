package Q1678;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1678
//@Memory 11160, @Time 70

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[5][5];

        for (int i=0; i<5; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<5; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken()); 
        	}
        }
        
        int max = 0;
        int sum = 0;
        int width = 0;
        int height = 0;
        for (int p=0; p<9; p++) {
            for (int i=width; i<width+3; i++) {
            	for (int j=height; j<height+3; j++) {
        			sum += arr[i][j];	
                	
                	if (max < sum) {
                		max = sum;
                	}
            	}
            }
            
            sum = 0;
            
            if (width!=2) {
            	width++;
            } else {
            	width = 0;
            	height++;
            }
        }
        
        System.out.println(max);
    }
    	 
}