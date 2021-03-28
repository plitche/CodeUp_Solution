package Q1204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1204
//@Memory 11164, @Time 93

public class Answer1 {
	// 1~99 중 하나가 숫자가 입력되면 영어 서수 표현을 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int number = Integer.parseInt(br.readLine());
		
		// 10단위는 서수가 다르기 때문에 주의해야 한다.
		if (number/10 == 1) {
			sb.append(number+"th");
		} else {
			// 1~99까지 입력되기 때문에 10으로 나눈 나머지를 기준으로 계산한다.
			switch (number%10) {
			case 1 : sb.append(number+"st"); break;
			case 2 : sb.append(number+"nd"); break;
			case 3 : sb.append(number+"rd"); break;
			default: sb.append(number+"th");
			}
		}
		
		System.out.println(sb);
		br.close();
	}

}
