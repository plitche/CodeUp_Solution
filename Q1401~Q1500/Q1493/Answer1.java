package Q1493;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1484
//@Memory 11184, @Time 69

public class Answer1 {
	//	다음과 같은 n*m 배열 구조를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 숫자를 저장할 배열 선언
        int[][] numbers = new int[n][m];
        
        // 입력받을 라인 수 만큼 for문 반복
        for (int i=0; i<n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            
            // 각 줄에 입력받을 숫자만큼 for문 반복
            for (int j=0; j<m; j++) {
            	int number = Integer.parseInt(st1.nextToken());
            	if (i>0) { // 두 번쨰 줄 부터
            		if (j>0) {	// 열의 index가 0보다 큰 경우
                		numbers[i][j] = numbers[i][j-1] + number + numbers[i-1][j] - numbers[i-1][j-1];
                	} else {
                		numbers[i][j] = numbers[i-1][j] + number;	
                	}            		
            	} else {
            		if (j>0) {	// 열의 index가 0보다 큰 경우
                		numbers[i][j] = numbers[i][j-1] + number; 
                	} else {
                		numbers[i][j] = number;	
                	}
            	}
            }
        }
 
        for (int[] i : numbers) {
        	for (int j : i) {
        		sb.append(j).append(" ");	
        	}
        	sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    	 
}