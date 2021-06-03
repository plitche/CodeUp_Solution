package Q1707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1707
//@Memory 11264, @Time 97

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] score = new int[10];
        double total = 0.0;
        for (int i=0; i<10; i++) {
        	int grade = Integer.parseInt(st.nextToken());
        	total += grade;
        	score[i] = grade;
        }
        
        double avg = total/10.0;
        sb.append(avg).append("\n");

        int higher = 0;
        for (int i=0; i<10; i++) {
        	if (score[i]>=avg) {
        		higher++;
        	}
        }
 
        sb.append(higher).append(" ").append(10-higher);
        System.out.println(sb);
    }
    	 
}