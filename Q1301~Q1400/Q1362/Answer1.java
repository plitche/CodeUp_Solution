package Q1362;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1362
//@Memory 11292, @Time 69

public class Answer1 {
	//	길이 n이 입력되면 다음과 같은 숫자 피라미드를 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        // 가장 높은 숫자 구하기
        int count = 0;
        for (int i=1; i<=n; i++) {
        	count+=i;
        }
        
        // n만큼 for문 반복
        for (int i=1; i<=n; i++) {
        	for (int j=0; j<i; j++) {
                sb.append(count).append(" ");	// 숫자를 하나씩 append해주고 -1해준다.
                count--;
            }
            sb.append("\n");
        }
        System.out.println(sb);
	}
	
}