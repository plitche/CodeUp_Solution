package Q2412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2412
//@Memory 14272, @Time 104
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine()); // 사람 숫자 입력받기
        StringTokenizer st; 
        
        Double total = 0.0;
        for (int i=0; i<people; i++) { // 사람의 숫자만큼 반복
        	st = new StringTokenizer(br.readLine(), ","); // 반복문이 돌때마다 한줄씩 입력받아 ,를 기준으로 나누어 토큰화
        	st.nextToken(); // 불필요 토큰
        	st.nextToken(); // 불필요 토큰
        	double age = Double.parseDouble(st.nextToken()); // 다음 토큰을꺼내어 double타입으로 변수에 저장
        	total += age;
        }
        
        System.out.println(String.format("%.2f", total/people)); // 평균나이를 반올림하여 계산
	}
}
 
