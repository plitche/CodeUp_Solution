package Q1291;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1291
//@Memory 11172, @Time 84

public class Answer1 {
	//	최근 유행인 바이러스는 모두 3가지 종류로 각 바이러스들은 모두 3000이하의 자연수로 표현된다.
	//	백신도 3000 이하의 자연수로 표현되며, 만약 바이러스의 값이 백신의 값으로 나누어 떨어지면 백신으로 바이러스 감염을 예방할 수 있다.
	//	백신의 개발비는 백신의 숫자 값이 작을수록 비싸다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int virus1 = Integer.parseInt(st.nextToken());
		int virus2 = Integer.parseInt(st.nextToken());
		int virus3 = Integer.parseInt(st.nextToken());
		
		int cure = 0;
		// 번호의 숫자가 클수록 싸지기 때문에 더 높은 숫자중 나누어  떨어지는 숫자가 있으면 계속 cure 갱신
		for (int i=1; i<=virus1; i++ ) {
			if (virus1%i==0 && virus2%i==0 && virus3%i==0) {
				cure = i;
			}
		}
		
		System.out.println(cure);
		br.close();
	}
	
}