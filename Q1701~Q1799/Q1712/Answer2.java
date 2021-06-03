package Q1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1712
//@Memory 11184, @Time 88

public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int minus = second - first;
        
        sb.append(first).append(" ").append(second).append(" ");
        for (int i=second; i<=end; i+=minus) {
        	sb.append(i).append(" ");
        }
        
        System.out.println(sb);
    }
    	 
}