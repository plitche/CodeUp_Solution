package Q1210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1210
//@Memory 11240, @Time 92

public class Answer1 {
	//	메뉴의 번호가 차례대로 두개 주어진다. (정수)
	//	그 번호의 메뉴 칼로리를 계산하여 500보다 크면 "angry", 500이하면 "no angry"를 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 총 칼로리를 0으로 초기화 선언
		int total = 0;
				
		// 2개의 메뉴 숫자를 입력 받자마자 계산한다.
		for (int i=0; i<2; i++) {
			// 메뉴의 칼로리에 맞게 계산 
			switch (st.nextToken()) {
			case "1" : total+=400; break;
			case "2" : total+=340; break;
			case "3" : total+=170; break;
			case "4" : total+=100; break;
			default: total+=70; break;
			}
		}
		// 삼항 연산자를 사용해 저장
		bw.append(total>500? "angry":"no angry");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
