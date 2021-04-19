package Q1370;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1370
//@Memory 11860, @Time 73

public class Answer1 {
	//	이번엔 공백의 방향까지 정하여 평행사변형을 만들자.
	//	L=왼쪽 아래에 공백 / R=오른쪽 아래에 공백
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int h = Integer.parseInt(st.nextToken());	// 높이
        int k = Integer.parseInt(st.nextToken());	// 반복 회수

    	// 높이의*2-1만큼 for문 반복 (오른쪽으로 늘어날 때+왼쪽으로 줄어들 때)
    	for (int i=0; i<h*2-1; i++) {
    		if (i<h) {
    			for (int j=0; j<i; j++) {
        			sb.append(" ");
        		}
    		} else {
    			for (int j=0; j<h-(i-1); j++) {
        			sb.append(" ");
        		}
    		}
    		// 공백을 찍고나서 마지막에 별 하나
    		sb.append("*");
    		// 마지막줄에는 줄바꿈을 하지 않는다.
    		if (i==h*2-2) {
    			
    		} else {
    			sb.append("\n");
    		}
    	}

    	// 반복 회수만큼 출력
        for (int i=0; i<k; i++) {
        	System.out.println(sb);
        }
    }
	
}