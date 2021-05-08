package Q1508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1508
//@Memory 11176, @Time 94

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int length = Integer.parseInt(br.readLine());
        
        // 입력받을 숫자의 개수만큼 2차원 배열 선언
        int[][] arr = new int[length][length];
        
        // length만큼 for문 반복
        for (int i=0; i<length; i++) {
        	// 첫 번째 자리 숫자 저장
        	arr[i][0] = Integer.parseInt(br.readLine());
        }
        
    	for (int i=0; i<length-1; i++) {
    		for (int j=0; j<=i; j++) {
    			arr[i+1][j+1] = arr[i+1][j]-arr[i][j];
    		}
    	}
        	
        for (int[] i : arr) {
        	for (int j : i) {
        		if (j!=0) {
        			sb.append(j).append(" ");	
        		}
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}