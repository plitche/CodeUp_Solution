package Q1361;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1361
//@Memory 11592, @Time 71

public class Answer1 {
	//	길이 n이 입력되면 다음과 같은 숫자 피라미드를 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        // n만큼 for문 반복
        for (int i=0; i<n; i++) {
        	for (int j=0; j<i; j++) {
                sb.append(" ");
            }
            sb.append("**").append("\n");
        }
        System.out.println(sb);
	}
	
}