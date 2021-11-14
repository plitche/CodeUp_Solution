package Q1509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1509
//@Memory 11248, @Time 67

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 각 줄의 숫자 10개를 입력받을 배열 선언
        int[] numbers = new int[10];
        
        // 10*10 만큼 입력받을 예정임으로 10번만큼 돌린다.
        for (int i=0; i<10; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<10; j++) {
        		// 통과가 아닐 경우
        		int no = Integer.parseInt(st.nextToken());
        		if (no != 0) {
        			if (no > 0) {
        				numbers[j] = 1;	// 충돌
        			} else if (no < 0) {
        				numbers[j] = -1; // 구멍
        			}
        		}
        	}
        }
        
        // 마지막 말들의 위치 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<10; i++) {
        	int no = Integer.parseInt(st.nextToken());
        	// 말이 있으면
        	if (no == 1) {
        		if (numbers[i] == 0) {	// 장애물이 없으면
        			sb.append(i+1).append(" ").append("safe");
        		} else if (numbers[i] == 1) { // 충돌
        			sb.append(i+1).append(" ").append("crash");
        		} else {
        			sb.append(i+1).append(" ").append("fall");
        		}
        		sb.append("\n");
        	}
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}