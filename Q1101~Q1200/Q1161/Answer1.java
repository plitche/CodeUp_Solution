package Q1161;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1161
//@Memory 11260, @Time 68

public class Answer1 {
	// 정수 두개가 입력으로 들어온다.
	// 만약 첫번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "+"를 출력한다.
	// 그리고 두번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "="을 출력하고 결과로 나오는 값이 홀수인지 짝수인지 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		// a가 홀수인지 짝수인지 판단
		if (a%2 == 0) {
			bw.append("짝수+");
		} else {
			bw.append("홀수+");
		}
		// b가 홀수인지 짝수인지 판단		
		if (b%2 == 0) {
			bw.append("짝수=");
		} else {
			bw.append("홀수=");
		}
		// a+b가 홀수인지 짝수인지 판단
		if ((a+b)%2==0) {
			bw.append("짝수");
		} else {
			bw.append("홀수");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
