package Q1660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1660
//@Memory 11164, @Time 68

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ,(컴마) 기준으로 문자열을 나누어 토큰을 활용
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        StringBuilder sb = new StringBuilder();

        // 토큰이 있을때까지 반복
        while(st.hasMoreTokens()) {
        	sb.append(st.nextToken()).append(" ");
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}