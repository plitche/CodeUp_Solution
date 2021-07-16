package Q1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1753
//@Memory 11100, @Time 108

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int people = Integer.parseInt(br.readLine());
        String line;
        
        for (int i=0; i<people; i++) {
        	line = br.readLine();
        	for (int j=line.length()-1; j>=0; j--) {
            	sb.append(line.charAt(j));
            }	
        	sb.append("\n");
        }
        
        System.out.println(sb);
	}
    	 
}