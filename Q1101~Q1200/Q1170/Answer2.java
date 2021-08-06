package Q1170;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1170
//@Memory 11172, @Time 66

public class Answer2 {
	// 학번을 입력 받아 다음 형식으로 출력하시오.
	// 학번은 학년, 반, 번호로 입력된다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		// 순서대로 입력 될 학년, 반을 바로 더해준다.
		sb.append(st.nextToken()).append(st.nextToken());
		
		int number = Integer.parseInt(st.nextToken());
		if (number>=10) {	// 번호가 10 이상이면
			sb.append(number);
		} else {	// 번호가 10 미만이면
			sb.append("0" + number);
		}
		System.out.print(sb);
	}

}
