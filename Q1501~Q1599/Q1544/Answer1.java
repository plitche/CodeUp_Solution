package Q1544;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1544
//@Memory 11160, @Time 95
public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        
        for (int i=0; i<number; i++) {
        	sb.append("*");
        }
        
        System.out.println(sb);
    	
    }
    
}