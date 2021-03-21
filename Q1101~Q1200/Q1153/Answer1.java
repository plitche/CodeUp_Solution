package Q1153;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1153
//@Memory 11216, @Time 69

public class Answer1 {
	// 두 정수가 입력된다. 두 정수의 크기를 비교하여 왼쪽 수가 크면 > 를 출력, 오른쪽 수가 크면 < 를 출력, 같으면 = 을 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		bw.append(a<b? "<": a>b? ">":"=");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
