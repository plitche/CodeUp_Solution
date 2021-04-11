package Q1286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1286
//@Memory 11176, @Time 95

public class Answer1 {
	//	5개의 정수들의 최댓값과 최솟값을 구하는 프로그램을 작성하라.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] numbers = new int[5];
		// 입력 받아서 배열에 저장
		for (int i=0; i<5; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		// 배열 정렬
		Arrays.sort(numbers);
	
        System.out.println(numbers[4]);
        System.out.println(numbers[0]);
        br.close();
	}
	
}