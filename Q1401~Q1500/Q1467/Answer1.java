package Q1467;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1467
//@Memory 12664, @Time 82

public class Answer1 {
	//	다음과 같은 n*m 배열 구조를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // 입력받을 숫자의 개수 만큼 for문 반복
        for (int i=1; i<=n; i++) {
        	for (int j=n*m-(n-i); j>=i; j-=n) {
        		if (m==1 && n==1) {
        			sb.append(i);
        			break;
        		} else {
        			sb.append(j).append(" ");	
        		}
        	}
        	if (n!=1) {
        		sb.append("\n");	
        	}
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}