package Q1277;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1277

public class Answer3 {
	//	첫 줄에 데이터의 개수 N(N은 홀수)이 입력되고, 그 다음 줄에 N개의 데이터가 입력된다.
	//	여기서 첫번째 데이터, 중간 데이터, 마지막 데이터를 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 숫자가 몇개인지 입력받는다.
		int n = Integer.parseInt(br.readLine());
		// 공백을 기준으로 나눈다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 가장 첫번째 숫자는 무조건 저장한다.
		sb.append(st.nextToken() + " ");
		
		// n이 1인 경우에는 숫자 하나만 출력해야 한다.
		if (n!=1) {
			// n-2번만큼 for문을 반복한다.
			for (int i=0; i<n-2; i++) {
				String number = st.nextToken();
				if (i==(n-2)/2) {
					sb.append(number + " "); //중간 숫자일때 sb에 저장한다.
				}
			}
			// 마지막  숫자는 무조건 저장한다.
			sb.append(st.nextToken());
		}
		
		System.out.print(sb);
		br.close();
	}
	
}