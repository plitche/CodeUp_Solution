package Q1169;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1169
//@Memory 11244, @Time 90

public class Answer1 {
	// 출생년도 뒤의 두자리와 연도정보(1이면 1900년대, 3이면 2000년대)를 출력한다.
	// (단, 출생년도 뒤 2자리가 10보다 작을 경우10의자리에 0은 붙이지 않고 출력한다.)
	// 예) 2009년생이라면 9 3 을 출력함.(09 3 이 아님) ※ 나이는 2012년도 기준입니다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int age = Integer.parseInt(br.readLine()); 	// 나이를 입력 받는다.
		int now = 2012; // 현재 년도

		int bornYear = now - (age-1); 	// 태어난 년도
		
		// 년도의 마지막 두자리만 append
		bw.append(String.valueOf(bornYear%100)).append(" ");
		
		if (age>13) {	// 나이가 12보다 크면 1900년대 생 
			bw.append("1");
		} else { // 나이가 12보다 같거나 작으면 2000년대 생
			bw.append("3");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
