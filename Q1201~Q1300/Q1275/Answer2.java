package Q1275;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1275
//@Memory 11200, @Time 82

public class Answer2 {
	//	공백을 기준으로 n과 k가 주어진다. (n은 0이 아닌 정수, k>=0) nk의 결과를 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		// 어떤 수의 0승은 1임으로 초기화를 1로 먼저 해준다.
		int result = 1;
		
		if (k==0) {	// 0승은 그냥 1이다.

		} else {
			for (int i=0; i<k; i++) {	// 몇승인지에 따라 for문 반복
				result*=n;
			}
		}
		
		System.out.println(result);
		br.close();
	}
	
}