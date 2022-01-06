package Q1912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1912
//@Memory 11164, @Time 67
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        loop(number, 1); // 입력받은 숫자와 결과의 초기값 1 넘기기
	}
	
	public static void loop(int number, int total) {
		
		if (number>0) { // number가 0보다 크면 해당 숫자를 total에 곱하고 -1하여 파라미터 넘기기
			loop(number-1, total*number);
		} else {
			System.out.println(total);
		}
		
	}
    	 
}
