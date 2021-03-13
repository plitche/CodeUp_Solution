package Q1127;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1127
//@Memory 14356, @Time 107

public class Answer1 {
	// 매번 시험을 치고 나면 자신의 성적을 기록해 놓고 기말고사가 끝나면 중간고사, 기말고사, 수행평가의 점수를 반영비율에 맞게 합산한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double[] percent = new Double[3];
		int[] grade = new int[3];
		
		// 중간고사, 기말고사, 수행평가 3개의 점수와 비율을 각각 배열에 저장한다.
		for (int i=0; i<3; i++) {
			percent[i] = sc.nextDouble();
			grade[i] = sc.nextInt();
		}
		
		Double[] score = new Double[3];
		Double total = 0.0;
		for (int i=0; i<3; i++) {
			score[i] = percent[i]*grade[i];	// 비율을 적용한 각각 점수를 score에 저장
			total += score[i];	// 저장된 score를 총합계에 더하기.
		}
		
		System.out.println(String.format("%.1f", total));
		sc.close();
	}

}
