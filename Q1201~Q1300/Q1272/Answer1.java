package Q1272;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1272
//@Memory 11156, @Time 83

public class Answer1 {
	//	입력의 개수 n이 입력되고 n개의  데이터가 입력된다. 이 n개의 데이터 중 최대값을 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// k와 h의 순번
		int k = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		// 합계를 0으로 초기화 선언
		int sum = 0;
		
		if (k%2==1) { // 홀수이면
			sum += (k/2)+1;	// 순번/2+1 해준다.
		} else { // 짝수이면
			sum += k/2*10;	// 순번/2*10 해준다.
		}
		
		if (h%2==1) { // 홀수이면
			sum += (h/2)+1;	// 순번/2+1 해준다.
		} else { // 짝수이면
			sum += h/2*10;	// 순번/2*10 해준다.
		}
		
		System.out.println(sum);
		br.close();
	}
	
}