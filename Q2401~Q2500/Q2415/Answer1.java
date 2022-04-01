package Q2415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2415
//@Memory 11324, @Time 70
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int people = Integer.parseInt(br.readLine());
        StringTokenizer st;

        String[] student = new String[people]; // 학생의 숫자만큼 문자열 배열 길이 초기화

        for (int i=0; i<people; i++) {
        	student[i] = br.readLine(); // 반복할때마다 입력받은 각 한줄을 배열에 저장
        }
        
        String target = br.readLine(); // 찾아야 되는 이름 입력 받기
        for (int i=0; i<people; i++) { // 학생의 숫자만큼 반복문 진행
        	st = new StringTokenizer(student[i], ","); // ,를 기준으로 token을 나누어 첫번째 토큰 = 이름과 찾아야되는 이름의 일치여부 확인
        	if (target.equals(st.nextToken())) {
        		st.nextToken(); // 필요없는 성별
        		st.nextToken(); // 필요없는 나이
        		
        		while (st.hasMoreTokens()) {
        			sb.append(st.nextToken()).append("\n"); // 나머지 이름들을 StringBuilder에 append
        		}
        		
        		break;
        	}
        	
        }
        
        System.out.println(sb);
	}
}
 