package Q1204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1204
//@Memory 11196, @Time 104

public class Answer2 {
	// 1~99 중 하나가 숫자가 입력되면 영어 서수 표현을 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int number = Integer.parseInt(br.readLine());

		// 10단위는 서수가 다르기 때문에 주의해야 한다.
		if (number/10 == 1) {
			sb.append(number+"th");
		} else {
			if (number%10 == 1) {
				sb.append(number+"st");
			} else if (number%10 == 2) {
				sb.append(number+"nd");
			} else if (number%10 == 3) {
				sb.append(number+"rd");
			} else {
				sb.append(number+"th");
			}
		}
				
		System.out.println(sb);
		br.close();
	}

}
