package Q1752;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1752
//@Memory 11108, @Time 93

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        
        for (int i=line.length()-1; i>=0; i--) {
        	sb.append(line.charAt(i));
        }
        
        System.out.println(sb);
	}
    	 
}