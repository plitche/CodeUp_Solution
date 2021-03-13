package Q1127;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1127
//@Memory 11496, @Time 72

public class Answer2 {
	// 매번 시험을 치고 나면 자신의 성적을 기록해 놓고 기말고사가 끝나면 중간고사, 기말고사, 수행평가의 점수를 반영비율에 맞게 합산한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Double result = 0.0;
		// 입력을 받자을때마다 계산하여 최종 result에 더해준다.
		for (int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			result += Double.parseDouble(st.nextToken())*Integer.parseInt(st.nextToken());
		}
		
		sb.append(String.format("%.1f", result));
		
		System.out.println(sb);
		br.close();
	}

}
