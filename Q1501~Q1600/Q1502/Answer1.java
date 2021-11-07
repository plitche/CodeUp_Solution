package Q1502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1502
//@Memory 11336, @Time 72

public class Answer1 {
	//	다음과 같은 n*m 배열 구조를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        // 입력받을 라인 만큼 for문 반복
        for (int i=1; i<=n; i++) {
        	for (int j=i; j<=n*n; j+=n) {
        		sb.append(j).append(" ");
        	}
        	sb.append("\n");
        }
 
        System.out.println(sb);
        br.close();
    }
    	 
}