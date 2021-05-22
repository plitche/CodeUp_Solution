package Q1365;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1365
//@Memory 11292, @Time 69

public class Answer1 {
	//	1. n이 입력된다.(3<=n<=100)
	//	2.대각선이 포함된 n*n사각형을 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        // 첫줄과 마지막줄은 이미 별을 찍었음으로 n-2만큼 반복
        for (int i=1; i<=n; i++) {
        	if (i==1 || i==n) { // 첫줄과 마지막줄은 입력받은 숫자만큼 별을 다 찍어야 한다.
            	for (int j=0; j<n; j++) {
            		sb.append("*");
            	}
        	} else {
            	// 각 줄의 첫번째 자리 별찍기
            	sb.append("*");
            	
            	if (i==n/2+1) {	// 정 가운대일 때는 별이 하나만 찍혀야 한다.
            		for (int j=0; j<(n-3)/2; j++) {
            			sb.append(" ");	
            		}
            		sb.append("*");
        			for (int j=0; j<(n-3)/2; j++) {
        				sb.append(" ");
            		}
            	} else {
            		if (i<n/2+1) {
            			int space = 0;
            			for (int j=2; j<i; j++) {
            				sb.append(" ");
            				space++;
                		}
                		sb.append("*");
                		for (int j=0; j<n-4-(space*2); j++) {
            				sb.append(" ");
                		}
                		sb.append("*");
                		for (int j=2; j<i; j++) {
            				sb.append(" ");
                		}
            		} else {
            			int space = 0;
            			for (int j=1; j<n-i; j++) {
            				sb.append(" ");
            				space++;
                		}
                		sb.append("*");
                		for (int j=0; j<n-4-(space*2); j++) {
            				sb.append(" ");
                		}
                		sb.append("*");
                		for (int j=1; j<n-i; j++) {
            				sb.append(" ");
                		}
            		}
            		
            	}
            	// 각 줄의 마지막 자리 별찍기
            	sb.append("*");
        	}
        	
        	// 줄바꿈
            sb.append("\n");
        }
        
        System.out.println(sb);
	}
	
}