package Q1367;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1367
//@Memory 11848, @Time 69

public class Answer1 {
	//	평행사변형의 높이 n이 주어진다.
	//	옆 면이 대각선으로 이루어지는 평행사변형을 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        // 입력받은 숫자만큼 for문 반복
        for (int i=0; i<n; i++) {
        	for (int j=i+1; j<n; j++) {	//공백을 찍을 for문
        		sb.append(" ");
        	}
        	
        	for (int j=0; j<n; j++) { //입력받은 숫자만큼 별 찍기
        		sb.append("*");
        	}
        	
        	// 줄바꿈
        	sb.append("\n");
        	
        }
        System.out.println(sb);
	}
	
}