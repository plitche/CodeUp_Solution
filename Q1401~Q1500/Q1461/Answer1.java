package Q1461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1461
//@Memory 12640, @Time 77

public class Answer1 {
	//	두 배열을 합쳐서 오름차순 정렬된 배열을 출력하시오.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        // 입력받을 숫자의 개수 만큼 for문 반복
        for (int i=1; i<=n; i++) {
        	// i를 기준으로 계속해서 행마다 역으로 숫자를 줄여 나간다.
        	for (int j=i*n; j>((i-1)*n); j--) {
        		sb.append(j).append(" ");
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}