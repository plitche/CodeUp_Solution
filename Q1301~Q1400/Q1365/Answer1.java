package Q1365;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1365
//@Memory 11876, @Time 65

public class Answer1 {
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // 첫줄은 무조건 별로 가득 채워야 한다.
        for (int i=0; i<n; i++) sb.append("*");
        sb.append("\n"); // 줄바꿈
        
        // 첫줄과 마지막줄은 별로 무조건 가득 채움으로 i=2부터 시작
        for (int i=2; i<n; i++) {
    		sb.append("*"); // 첫번째 자리는 무조건 별
        	
    		// 첫자리, 마지막자리 별을 찍었기 때문에 2부터 시작
    		for (int j=2; j<n; j++) {
    			// 줄과 자리수, 마지막에서 순번이 같을때 *찍기
    			if(i==j || i==n-j+1) sb.append("*");
    			else sb.append(" ");
    		}
        	
    		sb.append("*\n"); // 마지막 자리는 무조건 별 & 줄바꿈
        }
        
        // 마지막줄은 무조건 별로 가득 채워야 한다.
        for (int i=0; i<n; i++) sb.append("*");
        
        System.out.print(sb);
	}
	
}