package Q2502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2502
//@Memory 17892, @Time 131
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for (int i=0; i<count; i++) { // 입력 받은 count 만큼 반복
        	st = new StringTokenizer(br.readLine(), " "); // StringTokenizer를 통해 공백 기준으로 자르기
        	int n = Integer.parseInt(st.nextToken()); // 두 정수 변수에 저장
        	int k = Integer.parseInt(st.nextToken());
        	
        	if (k<n) { // 조건에 따라 StringBuilder에 값 저장
        		sb.append("2\n");
        	} else if (k*2%n==0) { // k의 2배를 n으로 나누었을 때 나누어 떨어지는 경우
			sb.append(k*2/n).append("\n");  // 나누었을 때 몫
            	} else {
            		sb.append(k*2/n+1).append("\n"); // n+1로 나누었을 때 몫
        	}
        }
        
        System.out.print(sb);
	}
}

