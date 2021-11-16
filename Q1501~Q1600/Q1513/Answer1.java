package Q1513;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1513
//@Memory 12436, @Time 84

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        // 각 줄의 숫자 10개를 입력받을 배열 선언
        int[][] numbers = new int[n][n];
        
        int count = 0;
        for (int i=0; i<n; i++) {
        	count += i;
        }

        int a = n*n-count;
        int i = n-1;	// 첫 행의 index
        int j = 0;	// 첫 열의 index
        int many = 0;
        
        int no = 1;
        while (no<=a) {
        	numbers[i][j] = no;
        	
        	if (many%2==0) {	// 정방향
        		if (i==many) {
        			i++;
        			many++;
        		} else {
        			i--;
        			j++;
        		}        		
        	} else {	// 역방향
        		if (i==n-1) {
        			j++;
        			many++;
        		} else {
        			i++;
        			j--;
        		}
        	}
        	
        	no++;
        }
        
        for (int[] p : numbers) {
        	for (int q : p) {
        		sb.append(q).append(" ");
        	}
        	sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    	 
}