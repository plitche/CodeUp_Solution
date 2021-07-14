package Q2051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2051
//@Memory 11180, @Time 69
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int score = 0;
        for (int i=0; i<4; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<4; j++) {
        		int number = Integer.parseInt(st.nextToken());
        		if (number>2) {
        			for (int k=4; k<=number; k*=2) {
        				score+=number;
            		}	
        		}
        	}
        }
        
    	System.out.println(score-(4*Integer.parseInt(br.readLine())));	
	}
}
