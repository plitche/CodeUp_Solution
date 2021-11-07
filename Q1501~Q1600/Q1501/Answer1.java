package Q1501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1501
//@Memory 11384, @Time 69

public class Answer1 {
	//	다음과 같은 n*m 배열 구조를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int number = 1;
        
        // 입력받을 라인 만큼 for문 반복
        for (int i=0; i<n*n; i++) {
        	sb.append(number++).append(" ");
        	if ((number-1)%n == 0) {
        		sb.append("\n");
        	}
        }
 
        System.out.println(sb);
        br.close();
    }
    	 
}