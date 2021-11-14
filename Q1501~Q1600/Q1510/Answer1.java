package Q1510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1510
//@Memory 11344, @Time 69

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int length = Integer.parseInt(br.readLine());
        
        // 각 줄의 숫자 10개를 입력받을 배열 선언
        int[][] numbers = new int[length][length];
        
        int i = 0;	// 시작 인덱스 i
    	int j = length/2;	// 시작 인덱스 j
        int start = 0;	// 시작 숫자
    	
        while (start++<length*length) {
        	numbers[i][j] = start;
        	
        	if (start%length==0) {
        		i++;
        	} else {
            	// 행 index를 순차적으로 줄여주되 첫 행이면 마지막 행으로
            	if (i==0) {
        			i=length-1;	
            	} else {
            		i--;	
            	}
            	
            	// 열 index를 순차적으로 늘려주되 마지막 열이면 첫 행으로
            	if (j==length-1) {
            		j=0;
            	} else {
            		j++;	
            	}        		
        	}
        }
        
        // for each문 활용
        for (int[] a : numbers) {
        	for (int b : a) {
        		sb.append(b).append(" ");
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}