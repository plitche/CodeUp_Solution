package Q1289;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1289
//@Memory 11188, @Time 84

public class Answer1 {
	//	3개의 운동장 중 가장 넓은 운동장의 넓이를 구하는 프로그램을 작성하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 3개의 운동장 가로 세로 길이 배열 선언
		int[] wide = new int[3];
		
		for (int i=0; i<3; i++) {
			st = new StringTokenizer(br.readLine());
			// 한줄 씩 배열에 곱하여 저장한다.
			wide[i] = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
		}
		
		// 배열 정렬
		Arrays.sort(wide);
		
		// 가장 높은 인덱스 출력
		System.out.println(wide[2]);
		br.close();
	}
	
}