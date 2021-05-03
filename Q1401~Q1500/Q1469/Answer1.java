package Q1469;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1469
//@Memory 12448, @Time 79

public class Answer1 {
	//	다음과 같은 n*m 배열 구조를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        // 입력받을 숫자의 개수 만큼 for문 반복
        for (int i=1; i<=n; i++) {
        	if (i%2==1) {	// 홀수 번째 줄 이면
        		for (int j=n*i; j>=n*(i-1)+1; j--) {
        			sb.append(j).append(" ");
            	}
        	} else {	// 짝수번째 줄 이면
        		for (int j=n*(i-1)+1; j<=n*i; j++) {
        			sb.append(j).append(" ");
            	}	
        	}
    		sb.append("\n");	
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}