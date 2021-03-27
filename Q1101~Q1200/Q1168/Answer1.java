package Q1168;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1168
//@Memory 11252, @Time 95

public class Answer1 {
	// 여기서 생년월일과 성별정보 입력으로 받겠다.
	// 성별 정보는 1이면 1900년대 출생 남자, 2이면 1900년대 출생 여자, 3이면 2000년대 출생 남자, 4이면 2000년대 출생 여자를 말한다.
	// 기준년도는 2012년도이다. 현재 나이를 출력하시오. 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 주민등록번호를 입력받는다. 
		int frontNo = Integer.parseInt(st.nextToken());
		int backNo = Integer.parseInt(st.nextToken());

		// 현재 년도
		int now = 2012;
		// 나이
		int age = 0;
		
		if (backNo==1 || backNo==2) {	// 1900년대생
			frontNo = frontNo/10000+1900;
		} else {	// 2000년대생
			frontNo = frontNo/10000+2000;
		}
		// 나이는 현재년도 - 태어난년도
		age = now - frontNo+1;
		
		bw.append(String.valueOf(age));
		
		bw.flush();
		br.close();
		bw.close();
	}

}
