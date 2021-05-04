package Q1473;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1473
//@Memory 12532, @Time 76

public class Answer1 {
	//	다음과 같은 n*m 배열 구조를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];	// 2차원 배열 선언
        
        int number = n*m;
        // 입력받을 숫자의 개수 만큼 for문 반복
        for (int i=0; i<n; i++) {
        	if (n%2!=0) {
        		if (i%2 == 0) {	// 홀수 번째 줄이면
            		for (int j=1; j<=m; j++) {
                		arr[i][m-j] = number;
                		number--;
                	}
            	} else {	// 짝수 번째 줄이면
            		for (int j=0; j<m; j++) {
                		arr[i][j] = number;
                		number--;
                	}        		
            	}	
        	} else {
        		if (i%2 != 0) {	// 홀수 번째 줄이면
            		for (int j=1; j<=m; j++) {
                		arr[i][m-j] = number;
                		number--;
                	}
            	} else {	// 짝수 번째 줄이면
            		for (int j=0; j<m; j++) {
                		arr[i][j] = number;
                		number--;
                	}        		
            	}
        	}
        }
        
        // for each문 활용
        for (int[] i : arr) {
        	for (int j : i) {
        		sb.append(j).append(" ");
        	}
        	sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    	 
}