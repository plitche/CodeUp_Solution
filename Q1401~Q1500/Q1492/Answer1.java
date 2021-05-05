package Q1492;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1484
//@Memory 11184, @Time 93

public class Answer1 {
	//	다음과 같은 n*m 배열 구조를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 숫자를 저장할 배열 선언
        int[] numbers = new int[count];
        
        // 입력받을 숫자 개수만큼 for문 반복
        for (int i=0; i<count; i++) {
        	int number = Integer.parseInt(st.nextToken()); // 숫자 입력 받기
        	if (i>0) {	// 배열 index가 0보다 크면
        		numbers[i] = numbers[i-1]+number;	// 바로 전 index 값과 더하기
        	} else {
        		numbers[i] = number;	
        	}
        }
 
        for (int i : numbers) {
        	sb.append(i).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
    	 
}