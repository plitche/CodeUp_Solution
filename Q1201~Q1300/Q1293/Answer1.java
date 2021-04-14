package Q1293;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1293
//@Memory 11296, @Time 88

public class Answer1 {
	//	n명의 점수가 입력되면 1등과 꼴등의 점수를 출력하는 프로그램을 작성하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int students = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 배열을 학생숫자만큼 길이로 선언한다.
		int[] score = new int[students];
		for (int i=0; i<students; i++) {
			score[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// 배열 정렬
		Arrays.sort(score);
		
		System.out.println(score[students-1] + " " + score[0]);
		br.close();
	}
	
}