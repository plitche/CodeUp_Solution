package Q1521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1521
//@Memory 11264, @Time 101

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int length = Integer.parseInt(st.nextToken());
        
        // 인삼받의 크기 만큼 배열 선언
        int[][] field = new int[length][length];
        
        // 택배올때까지 걸리는 시간
        int time = Integer.parseInt(st.nextToken());
           
        for (int i=0; i<length; i++) {
        	StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<length; j++) {
        		int number = Integer.parseInt(st1.nextToken());
        		if (number != -1) {	// 인삼이 없지 않다면 time만큼 더한 인삼의 상태를 저장 
        			field[i][j] = number+time;
        		} else {
        			field[i][j] = number;
        		}
        	}
        }
        
        // 필요한 가림막의 개수 0으로 초기화
        int count = 0;
        for (int[] i : field) {
        	for (int j : i) {
        		if (j!=-1 && j<6) {	// 인삼이 택배가 도착할때까지 정상적인 상태라면
        			count++;
        		}
        	}
        }

        System.out.println(count);
        br.close();
    }
    	 
}