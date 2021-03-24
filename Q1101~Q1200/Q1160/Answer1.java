package Q1160;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1160
//@Memory 11264, @Time 67

public class Answer1 {
	//	요일의 번호가 입력으로 주어지면 그 날이 아르바이트 가는 날이면 "oh my god"를 가는 날이 아니면 "enjoy"를 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		
		bw.append((a==1 || a==3 || a==5 || a==7) ? "oh my god":"enjoy");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
