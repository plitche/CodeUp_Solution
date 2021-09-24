package Q1358;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1358
//@Memory 11124, @Time 67

public class Answer2 {
	//	어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다. 여기서 입력되는 n은 반드시 홀수이다.
	 
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());

        // 입력받은 숫자만큼 for문 반복
        for (int i=0; i<n; i+=2) {
        	// 가로로 붙여야 하는 공백의 개수만큼 for문 반복
            for(int j=n/2; j>i/2; j--) {
                sb.append(" ");
            }
            // 가로로 붙여야 하는 별의 개수만큼 for문 반복 
            for (int j=n-i; j<=n; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
	}
	
}