package Q1679;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1679
//@Memory 11172, @Time 102

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int length = Integer.parseInt(br.readLine());
        
        int count = 0; 
        for (int i=1; i<=length-2; i++) {
        	for (int j=1; j<=length-1-i; j++) {
        		int c = length-i-j;
        		if ( (i+j<=c) || (i>j) || (j>c)) {
        			
        		} else {
        			sb.append(i + " ").append(j + " ").append(c).append("\n");
        			count++;
        		}
        		
        	}
        }
        
        System.out.println(count > 0 ? sb : -1);
    }
    	 
}