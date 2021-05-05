package Q1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1476
//@Memory 12760, @Time 119

public class Answer1 {
	//	다음과 같은 n*m 배열 구조를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];	// 2차원 배열 선언
        
        // 초기 index에 넗을 값 1로 선언
        int number = 1;
        
        for (int i=0; i<=n+m-2; i++) {
            //열 반복
            for (int j=0; j<m; j++) {
                //행 반복
                for (int k=0; k<n; k++) {
                    //행과 열의 합이 j와 같다면 count 넣고 증가시키기
                    if (j+k == i) {
                        arr[k][j] = number++;
                        break;
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