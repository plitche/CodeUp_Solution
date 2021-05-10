package Q1521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1521
//@Memory 11224, @Time 105

public class Answer2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 인삼밭의 크기
        int length = Integer.parseInt(st.nextToken());
        
        // 택배올때까지 걸리는 시간
        int time = Integer.parseInt(st.nextToken());
        
        // 필요한 가림막의 개수 0으로 초기화
        int count = 0;
        
        for (int i=0; i<length; i++) {
        	StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<length; j++) {
        		int number = Integer.parseInt(st1.nextToken());
        		if (number != -1) {	// 인삼이 없지 않다면 time만큼 더한 인삼의 상태를 비교 
        			if (number+time<6) {	// 인삼이 정상적인 상태라면
        				count++;
        			} 
        		} 
        	}
        }

        System.out.println(count);
        br.close();
    }
    	 
}