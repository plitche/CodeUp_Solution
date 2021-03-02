package Q1093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1093
//@Memory 12928, @Time 85

public class Answer2 {
	// 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 총 부른 횟수
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int[] studentNo = new int[24]; // 각 번호(1~23) 총 24명의 숫자만큼 배열 길이 선언
        for (int i=0; i<n; i++) {
            studentNo[Integer.parseInt(st.nextToken())] += 1; // 불린 번호의 index에 1 추가 하기
        }
        for (int i=1; i< studentNo.length; i++) {
            sb.append(studentNo[i]).append(" "); // 각 index별 총 불린 횟수 출력
        }
        System.out.println(sb);
    }

}
