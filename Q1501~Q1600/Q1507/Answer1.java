package Q1507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1507
//@Memory 11204, @Time 68

public class Answer1 {
	//	다음과 같은 n*m 배열 구조를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] arr = new int[4][4];	// 4개의 직사각형 꼭지점을 저장할 배열
        
        StringTokenizer st;

        // 4개의 직사각형임으로 4번 반복
        for (int i=0; i<4; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<4; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        // 직사각형의 넓이를 저장할 배열
        int[][] wide = new int[99][99];
        
        for (int i=0; i<4; i++) {
        	// 직사각형 가로 범위만큼 for문 반복
        	for (int j=arr[i][0]; j<arr[i][2]; j++) {
        		// 직사각형 세로 범위만큼 for문 반복
        		for (int k=arr[i][1]; k<arr[i][3]; k++) {
        			wide[j][k] = 1; // =색칠하기
        		}
        	}
        }

        int result = 0;
        for (int[] i : wide) {
        	for (int j : i) {
        		if (j==1) {
        			result++;
        		}
        	}
        }
        
        System.out.println(result);
        br.close();
    }
    	 
}