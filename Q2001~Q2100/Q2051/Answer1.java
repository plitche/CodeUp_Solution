package Q2051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2051
//@Memory 11180, @Time 69
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int score = 0; // 0으로 초기화
        for (int i=0; i<4; i++) { // for문 4번 반복
        	st = new StringTokenizer(br.readLine(), " "); // 반복할떄마다 한줄을 StringTokenizer로 쪼갠다.
        	for (int j=0; j<4; j++) { // inner for문 4번 반복
        		int number = Integer.parseInt(st.nextToken()); // st에서 하나씩 꺼내어
        		if (number>2) { // 해당 숫자가 2보다 큰 경우에
        			for (int k=4; k<=number; k*=2) {
        				score+=number; // 총점에 해당 숫자를 더해준다.
            		}	
        		}
        	}
        }
        
        // 마지막에 입력받는 줄 *4를 총점에서 뺀 결과를 출력.
    	System.out.println(score-(4*Integer.parseInt(br.readLine()))); 
	}
}
