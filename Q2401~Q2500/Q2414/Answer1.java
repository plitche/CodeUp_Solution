package Q2414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2414
//@Memory 11280, @Time 63
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        StringTokenizer st;

        String[] name = new String[people]; // 학생의 숫자의 길이만큼 배열의 길이 지정
        int[] age = new int[people]; // 나이를 저장할 정수형 배열의 길이 지정

        for (int i=0; i<people; i++) { // 학생의 숫자만큼 반복문 진행
        	st = new StringTokenizer(br.readLine(), ","); // ,(쉼표)를 기준으로 한줄 입력 받기
        	name[i] = st.nextToken(); // 가장 첫번째 자리의 token을 꺼내어 배열에 저장
        	st.nextToken(); // 다음 성별은 불필요하기에 그냥 호출
        	age[i] = Integer.parseInt(st.nextToken()); // 그 다음 나이 입력 받기
        }
        
        String target = br.readLine(); // 찾아야되는 학생의 이름 입력 받기
        for (int i=0; i<people; i++) {
        	if (name[i].equals(target)) { // 이름 동일 여부 확인 후 해당 index자리의 나이 출력
        		System.out.println(age[i]);
        	}
        	
        }
	}
}
 