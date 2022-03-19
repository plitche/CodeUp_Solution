package Q2082;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2082
//@Memory 21780, @Time 136
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = Integer.parseInt(st.nextToken()); // 수의 개수 입력받기
        int number = Integer.parseInt(st.nextToken()); // 위치를 찾을 정수 입력 받기

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        boolean isFind = false; // 찾았는지 여부 변수로 false 초기화
        for (int i=0; i<count; i++) { // 수의 개수만큼 for문 반복
        	int no = Integer.parseInt(st2.nextToken());
        	if (no == number) { // 입력 받은 숫자가 number와 일치한지 체크
        		isFind = true;  // boolean 변수 true로 변환
        		sb.append(i+1); // i번째 index +1 (수열의 n번째)
        		break;
        	} 
        }
        
        System.out.println(isFind ? sb : "-1");	// isFind가 true이면 sb 출력 아니면 -1 
    	
	}
}
