package Q1167;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1167
//@Memory 11244, @Time 112

public class Answer2 {
	// 세 개의 숫자가 주어질 때 두번째로 작은 수를 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 3개의 숫자 입력 받기

		int[] number = new int[3]; 
		for (int i=0; i<3; i++) {
			// 입력받은 숫자 3개 배열에 저장
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		// 정렬
		Arrays.sort(number);
		
		// 중간 index 출력 
		bw.append(String.valueOf(number[1]));
		bw.flush();
		br.close();
		bw.close();
	}

}
