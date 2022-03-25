package Q2084;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2084
//@Memory 147328, @Time 3954 시간초과
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine()); // 원소의 개수 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // n개의 정수를 공백을 구분으로 입력

        String[] arr = new String[count]; // 원소의 개수만큼 배열 길이 지정
        for (int i=0; i<count; i++) {
        	arr[i] = st.nextToken(); // 해당 index자리에 입력받았던 n개의 정수 저장
        }

        int qNo = Integer.parseInt(br.readLine()); // 질문의 수 입력
        
        for (int i=0; i<qNo; i++) { // 질문의 수만큼 반복
        	String no = br.readLine(); // 찾고자 하는 숫자 입력 받기
        	
        	for (int j=0; j<count; j++) {
        		if (arr[j].equals(no)) { // 찾고자 하는 숫자와 배열에 저장했던 숫자와 일치하는지 반복문 
        			sb.append(j+1+"\n"); // 일치하는 경우
        			break;
        		} else { // 일치하지 않는 경우
        			if (j==count-1) {
        				sb.append("-1\n");
        			}
        		}
        	}
        }
        
        System.out.println(sb);	
    	
	}
}