package Q1679;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1679
//@Memory 11180, @Time 94

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int length = Integer.parseInt(br.readLine());
        
        int count = 0;
        for (int i=1; i<=length-2; i++) { // i == 1번 변
        	for (int j=1; j<=length-1-i; j++) { // j == 2번 변
        		int c = length-i-j; // c == 3번 변
        		// 1. 짧은 두 변의 합이 가장 긴 변의 합보다 작아야 한다.
        		// 2. 순차적으로 크기 비교 (가장 짧은 변 <= 중간 길이 <= 가장 긴 변)
        		if (i+j>c && i<=j && j<=c) {
        			sb.append(i + " ").append(j + " ").append(c).append("\n");
        			count++;
        		}
        	}
        }
        
        // 3항 연산자 이용 : 위의 조건을 일치하는 갯수가 1개 이상일 때 출력
        System.out.println(count > 0 ? sb : -1);
    }
    	 
}