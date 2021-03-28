package Q1203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1203
//@Memory 11160, @Time 91

public class Answer1 {
	// 비만을 판단하기 위해서 BMI 수치가 필요하다. BMI 수치가 입력되면 비만을 판단하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int bmiValue = Integer.parseInt(br.readLine());

		// 10이하 정상, 20이하 과체중이기 때문에 -1이후에 몫을 기준으로 계산한다.
		switch ((bmiValue-1)/10) {
		case 0 : sb.append("정상"); break;
		case 1 : sb.append("과체중"); break;
		default: sb.append("비만");
		}
		
		System.out.println(sb);
		br.close();
	}

}
