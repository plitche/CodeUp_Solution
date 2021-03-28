package Q1202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1202
//@Memory 11176, @Time 109

public class Answer2 {
	// 재호는 이번 시험에 받은 성적이 궁금했다. 점수가 입력되면 등급을 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int score = Integer.parseInt(br.readLine());

		if (score>=90) {
			sb.append("A");
		} else if (score>=80) {
			sb.append("B");
		} else if (score>=70) {
			sb.append("C");
		} else if (score>=60) {
			sb.append("D");
		} else {
			sb.append("F");
		} 
		
		System.out.println(sb);
		br.close();
	}

}
