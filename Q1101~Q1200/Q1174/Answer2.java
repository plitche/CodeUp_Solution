package Q1174;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1174
//@Memory 11216, @Time 70

public class Answer2 {
	// 공백을 기준으로 시간과 분이 주어진다. 그러면 이 시간을 기준으로 30분전의 시간을 출력하시오.
	// if, switch, 3항연산자 사용하지 않고 풀기
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		// 시와 분을 입력 받는다.
		int hour = Integer.parseInt(st.nextToken());
		int minutes = Integer.parseInt(st.nextToken());

		// 시간에 24시(1일)을 더해서 분으로 환산한다.
		int total = (hour+24)*60+minutes;
		// 30분을 뺸다.
		total -= 30;
		
		hour = (total/60)%24;	// 60으로 나눈 몫의 24로 나눈 나머지 (1일이 넘을수 있기 때문에)
		minutes = total%60;		// 60으로 나눈 나머지
		
		//출력
		sb.append(hour + " ").append(minutes);
		System.out.print(sb);
	}

}
