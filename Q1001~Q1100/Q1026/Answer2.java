package Q1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1026
//@How BufferedReader, StringTokenizer
//@Memory 11096, @Time 83

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer에 대한 설명은 Q1013 - Answer2 참고
		StringTokenizer time = new StringTokenizer(br.readLine(), ":");
		// 입력받은 시간을 ":" 기준으로 분리한다.
		
		time.nextToken();	//첫번째에 있는 '시' 는 그냥 받아서 버린다.
		int minute = Integer.parseInt(time.nextToken());	// 두번째 토큰이 '분'
		// int 타입으로 저장하면 앞자리에 있는 0은 자동으로 제거된다.
		
		System.out.println(minute);
		br.close();
	}
}
