package Q1378;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1378
//@Memory 11116, @Time 67

public class Answer1 {
	//	수열의 합 Sn의 값을 출력한다.
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 총 합계를 0으로 초기화 선언
        int total = 0;
        
        for (int i=1; i<=n; i++) {
        	for (int j=1; j<=i; j++) {
        		total += j;
        	}
        	
        }
        System.out.println(total);
    }
	
}