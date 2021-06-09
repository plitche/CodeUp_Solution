package Q1735;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1735
//@Memory 11164, @Time 94

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); 
        int count = Integer.parseInt(br.readLine());
        
        for (int i=0; i<count; i++) {
        	sb.append("hello").append("\n");
        }
        
        System.out.println(sb);
    }
    	 
}