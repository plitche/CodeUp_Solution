package Q1203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1203
//@Memory 11176, @Time 109

public class Answer2 {
	// 비만을 판단하기 위해서 BMI 수치가 필요하다. BMI 수치가 입력되면 비만을 판단하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int bmiValue = Integer.parseInt(br.readLine());

		if (bmiValue>20) {
			sb.append("비만");
		} else if (bmiValue>10) {
			sb.append("과체중");
		} else {
			sb.append("정상");
		}
		
		System.out.println(sb);
		br.close();
	}

}