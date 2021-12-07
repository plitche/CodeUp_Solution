package Q1707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1707
//@Memory 11292, @Time 69

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] score = new int[10]; // 10명의 점수를 받기로 했기때문에 길이 10으로 초기화
        // 총점 total 변수 초기화
        double total = 0.0; // double타입으로 하여야 추후 평균을 구할 때 소수점까지 표기 
        
        for (int i=0; i<10; i++) {
        	int grade = Integer.parseInt(st.nextToken()); // 토큰에서 하나씩 꺼내어 형변환 후 저장 
        	total += grade;	// 토탈에 더해주기
        	score[i] = grade;
        }
        
        double avg = total/10.0; // 평균 구하기
        sb.append(avg).append("\n");

        int higher = 0;
        for (int i=0; i<10; i++) {
        	if (score[i]>=avg) {
        		higher++; // 배열에 값을 하나씩 꺼내어 평균 이상인지 체크
        	}
        }
 
        sb.append(higher).append(" ").append(10-higher);
        System.out.println(sb);
    }
    	 
}