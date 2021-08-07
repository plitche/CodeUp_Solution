package Q1172;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1172
//@Memory 11208, @Time 68

public class Answer3 {
	// 세 수를 오름차순으로 정렬하려고 한다. (낮은 숫자 -> 높은 숫자)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		// 3수를 배열에 저장
		int[] number = new int[3];
		for (int i=0; i<3; i++) {
			// 배열에 인덱스 증가에 따라 저장
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 정렬
		Arrays.sort(number);
		
		// 향상 for문
		for (int i : number) {
			sb.append(String.valueOf(i)+" ");
		}
		System.out.print(sb);
	}
}
