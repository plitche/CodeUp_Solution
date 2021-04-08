package Q1271;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1271
//@Memory 11468, @Time 92

public class Answer1 {
	//	입력의 개수 n이 입력되고 n개의  데이터가 입력된다. 이 n개의 데이터 중 최대값을 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 몇개의 정수를 입력 받을지
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 가장 큰 수를 0으로 초기화 선언해놓는다.
		int maxNum = 0;
		
		// 1부터 n까지 for문 반복
		for (int i=0; i<n; i++) {
			int number = Integer.parseInt(st.nextToken());
			if (maxNum < number) {	// 입력 받은 숫자가 maxNum보다 크면 
				maxNum = number;	// 바꿔준다.
			}
		
		}
		
		System.out.println(maxNum);
		br.close();
	}
	
}