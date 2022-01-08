package Q1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1929
//@Memory 11856, @Time 73
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        loop(number); // 입력받은 숫자를 loop에 넘긴다.
	}
	
	public static void loop(int number) {
		if (number==1) {
			System.out.println(1); // 파라미터로 받은 숫자가 1이면 1출력
			return;
		}
		if (number%2==0) { // 해당 숫자가 짝수면
			loop(number/2); // loop에 /2 한 값으로 넘기기
		} else {
			loop(number*3+1); // 홀수이면 *3+1 결과 넘기기
		}
		
		System.out.println(number);
	}
    	 
}
