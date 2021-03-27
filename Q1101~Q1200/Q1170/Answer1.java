package Q1170;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1170
//@Memory 11188, @Time 91

public class Answer1 {
	// 학번을 입력 받아 다음 형식으로 출력하시오.
	// 학번은 학년, 반, 번호로 입력된다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 순서대로 입력 될 학년, 반을 바로 더해준다.
		bw.append(st.nextToken()).append(st.nextToken());
		
		int number = Integer.parseInt(st.nextToken());
		if (number>=10) {	// 번호가 10 이상이면
			bw.append(String.valueOf(number));
		} else {	// 번호가 10 미만이면
			bw.append("0" + number);
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
