package Q1460;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1460
//@Memory 12432, @Time 82

public class Answer2 {
	//	두 배열을 합쳐서 오름차순 정렬된 배열을 출력하시오.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        // 입력받을 숫자의 개수의 제곱 만큼 for문 반복
        for (int i=1; i<=n*n; i++) {
        	sb.append(i).append(" ");
        	// 가로 길이를 n개만큼 입력 받았으면 줄바꿈해라.
        	if (i!=0 && i%n==0) {
        		sb.append("\n");
        	}
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}