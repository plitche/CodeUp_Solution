package Q1207;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1207
//@Memory 11212, @Time 92

public class Answer1 {
	//	4개의 윷 상태가 입력되면 도, 개, 걸, 윷, 모를 출력하는 프로그램을 작성하시오.
	//	① 윷의 4가지 상태가 공백으로 구분되어 입력된다.
	//	② 윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태를 의미한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 4개의 윷 상태를 입력 받는다.
		String a = st.nextToken();
		String b = st.nextToken();
		String c = st.nextToken();
		String d = st.nextToken();
		
		int result = 0;
		// 몇개가 뒤집어져 있는지 확인
		if (a.equals("0")) result+=1;
		if (b.equals("0")) result+=1;
		if (c.equals("0")) result+=1;
		if (d.equals("0")) result+=1;
		
		// 뒤집어져있는 개수에 따라 결과 저장
		switch (result) {
		case 0 : bw.append("윷"); break;
		case 1 : bw.append("걸"); break;
		case 2 : bw.append("개"); break;
		case 3 : bw.append("도"); break;
		default: bw.append("모"); break;
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
