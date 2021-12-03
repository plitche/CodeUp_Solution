package Q1701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1701
//@Memory 11148, @Time 82

public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String[] arr = new String[3];
        for (int i=0; i<3; i++) {
        	arr[i] = st.nextToken(); // 토크에서 하나씩 꺼내서 배열에 저장
        }
        
        for (int i=2; i>=0; i--) {
        	sb.append(arr[i]).append(" "); // 배열에서 거꾸로 출력
        }
        
        System.out.println(sb);
    }
    	 
}