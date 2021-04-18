package Q1359;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1359
//@Memory 11840, @Time 68

public class Answer1 {
	//	길이 n이 입력되면 다음과 같은 숫자 피라미드를 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        // n만큼 for문 반복
        for (int i=1; i<=n; i++) {
        	for (int j=0; j<i; j++) {
                sb.append(j+1).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
	}
	
}