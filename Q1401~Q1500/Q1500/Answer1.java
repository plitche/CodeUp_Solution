package Q1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1500
//@Memory 12444, @Time 80

public class Answer1 {
	//	다음과 같은 n*m 배열 구조를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 입력받을 라인 수 만큼 for문 반복
        for (int i=0; i<n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            // 각 줄에 입력받을 숫자만큼 for문 반복
            for (int j=0; j<m; j++) {
            	int number = Integer.parseInt(st1.nextToken());
            	sb.append(number).append(" ");
            }
            sb.append("\n");
        }
 
        System.out.println(sb);
        br.close();
    }
    	 
}