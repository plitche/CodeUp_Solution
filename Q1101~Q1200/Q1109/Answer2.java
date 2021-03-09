package Q1109;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1109
//@Memory 11240, @Time 68

public class Answer2 {
	// ① 첫째 줄에 이름을 입력한다.(영문자 20 문자이내)
	// ② 다음 줄에 나이를 입력한다.(정수)
	// ③ 다음 줄에 부서코드 A, B, C 중 하나를 입력한다.(영문자)
	// ④ 다음 줄에 보안키를 입력한다.(실수)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.append(br.readLine()+"\n");	// 4번 입력받고 입력받은것을 그대로 bw에 저장
		bw.append(br.readLine()+"\n");
		bw.append(br.readLine()+"\n");
		bw.append(br.readLine());
		
		bw.flush();
		bw.close();
		br.close();
	}

}
