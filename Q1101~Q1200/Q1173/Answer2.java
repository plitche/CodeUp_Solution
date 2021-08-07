package Q1173;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1173
//@Memory 11196, @Time 76

public class Answer2 {
	// 공백을 기준으로 시간과 분이 주어진다. 그러면 이 시간을 기준으로 30분전의 시간을 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		// 시와 분을 입력 받는다.
		int hour = Integer.parseInt(st.nextToken());
		int minutes = Integer.parseInt(st.nextToken());
		
		if (hour != 0) {
			if (minutes >= 30) {
				// 0시가 아니고 30분이상이면 따로 처리해주어야 할것이 없다.
				sb.append(hour+" ").append(minutes-30);
			} else {
				// 30분 미만이면 시에서 -1 해야한다.
				sb.append(hour-1+" ").append(minutes+30);
			}
		} else {
			if (minutes >= 30) {
				// 시가 0이어도 분이 30분이 넘는다면 따로 처리해줄 것은 없다.
				sb.append(hour+" ").append(minutes-30);
			} else {
				// 시가 0일때 30분 미만이면 전날 23시로 변경되어야 한다.
				sb.append(23+" ").append(minutes+30);
			}
		}
		System.out.print(sb);
	}

}
