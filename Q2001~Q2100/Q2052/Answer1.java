package Q2052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2052
//@Memory 11192, @Time 71
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i=0; i<5; i++) { // 5개의 정수를 입력 받기로 했음으로 5번 반복
        	int total = 0; // 총 합 0으로 초기화
        	int number = Integer.parseInt(st.nextToken()); // 숫자 입력 받기
        	
        	for (int j=1; j<=Math.sqrt(number); j++) { // 제곱근 까지 반복
        		if (number%j == 0) { // 나누어 떨어질 때
        			total+=j;	// 해당 숫자를 총 합에 더한다.
        			total+=number/j; // 그리고 나눈 몫도 총 합에 더한다.
        		}
        	}
        	
        	if (total-number == number) { // 완전수인지 판단하여 yes or no 를 출력
        		sb.append("yes\n");
        	} else {
        		sb.append("no\n");
        	}
        }
        
    	System.out.println(sb);	
	}
}
