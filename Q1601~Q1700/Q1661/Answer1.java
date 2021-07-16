package Q1661;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1661
//@Memory 11136, @Time 66

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        for(int i=0; i<line.length(); i++) {
			char a = line.charAt(i);
			
			if(a==',') {
				sb.append(" ");
			} else if(a==';') {
				sb.append("\n");
			} else if(a==' ') {
				continue;
			} else {
				sb.append(a);	
			}
			
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}