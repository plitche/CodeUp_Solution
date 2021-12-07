package Q1706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1706
//@Memory 11184, @Time 69

public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        String[] arr = new String[5];
        for (int i=0; i<5; i++) {
        	arr[i] = st.nextToken(); // 토큰에서 하나씩 꺼내어 배열에 저장
        }

        for (int i=4; i>=0; i--) {
        	sb.append(arr[i]).append(" "); // 역순으로 저장 
        }
        
        System.out.println(sb);
    }
    	 
}