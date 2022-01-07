package Q2762;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2601
//@Memory 11168, @Time 67
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), ","); //쉼표를 기준으로 나눔
        
        while(st.hasMoreTokens()) { // 토큰이 남아있을때까지 반복
        	sb.append(st.nextToken().charAt(0)); // 각토큰의 0번째 인덱스 값 sb에 append
        }
        
        System.out.println(sb);
	}
    	 
}

