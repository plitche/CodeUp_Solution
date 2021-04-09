package Q1277;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1277
//@Memory 11188, @Time 81

public class Answer1 {
	//	첫 줄에 데이터의 개수 N(N은 홀수)이 입력되고, 그 다음 줄에 N개의 데이터가 입력된다.
	//	여기서 첫번째 데이터, 중간 데이터, 마지막 데이터를 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int count = 0;
		Map<Object, Object> map = new HashMap<Object, Object>();
		// 첫줄에 입력받은 숫자만큼 for문 반복
		for (int i=1; i<=n; i++) {
			// 몇개인지 새어준다.
			count++;
			// 선언해 놓은 map에 입력 받을 때 마다 넣어준다.
			map.put(i, st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		// map에서 꺼내어 append해준다. (홀수임으로 +1해주어야 한다.)
		sb.append(map.get(1)+" ").append(map.get(count/2+1)+" ").append(map.get(count));
		System.out.println(sb);
		br.close();
	}
	
}