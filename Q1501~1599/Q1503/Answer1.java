package Q1503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1502
//@Memory 11176, @Time 110

public class Answer1 {
	//	다음과 같은 n*m 배열 구조를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int number = 1;
        
        // 입력받을 라인 만큼 for문 반복
        for (int i=0; i<n; i++) {
        	if (i%2==0) { // n의 배수의 바로 다음 숫자일 때 
        		for (int j=0; j<n; j++) {
            		arr[i][j] = number;
            		number++;
            	}	
        	} else {	//짝수 번째 줄 일때
        		for (int j=n-1; j>=0; j--) {
        			arr[i][j] = number;
            		number++;
            	}
        	}
        }

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