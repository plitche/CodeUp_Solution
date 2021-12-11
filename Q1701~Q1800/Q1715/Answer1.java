package Q1715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1715
//@Memory 11192, @Time 68

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        
        for (int i=2; i<=up; i++) {
        	if (up%i==0 && down%i==0) {
        		up = up/i;
        		down = down/i;
        		i--;
        	}
        }
        
        sb.append(up).append(" ").append(down);
        System.out.println(sb);
    }
    	 
}