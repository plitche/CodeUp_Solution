package Q1511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1511
//@Memory 11140, @Time 91

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        
        // 각 줄의 숫자 10개를 입력받을 배열 선언
        int[][] numbers = new int[length][length];
        
        int start = 1;  // 시작 숫자
        int total = 0;  // 총합
        
        for (int i=0; i<length; i++) {
        	for (int j=0; j<length; j++) {
        		numbers[i][j] = start;
        		total += start;	// 총합 업데이트
        		start++;	// 숫자 1씩 증가
        	}
        }
        
        int minus = 0;
        for (int i=1; i<length-1; i++) {
        	for (int j=1; j<length-1; j++) {
        		int a = numbers[i][j];
        		minus += a;	// 중간에 있는 값들 업데이트
        	}
        }
        
        System.out.println(total - minus);
        br.close();
    }
    	 
}