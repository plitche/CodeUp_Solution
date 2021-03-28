package Q1202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1202
//@Memory 11188, @Time 90

public class Answer1 {
	// 재호는 이번 시험에 받은 성적이 궁금했다. 점수가 입력되면 등급을 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int score = Integer.parseInt(br.readLine());

		// 점수를 10으로 나눈 몫 = 점수대가 나온다.
		switch (score/10) {
		case 10 : 
		case 9 : sb.append("A"); break;
		case 8 : sb.append("B"); break;
		case 7 : sb.append("C"); break;
		case 6 : sb.append("D"); break;
		default: sb.append("F");
		}
		
		System.out.println(sb);
		br.close();
	}

}
