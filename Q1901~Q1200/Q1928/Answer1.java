package Q1928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1928
//@Memory 11856, @Time 72
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        loop(number); // 입력받은 숫자를 loop에 넘긴다.
	}
	
	public static void loop(int number) {
		System.out.println(number); // 일단 메소드 실행시 파라미터값 바로 출력
		if (number==1) { // 해당 숫자가 1이 되면 끝내기
			return;
		}
		if (number%2==0) { // 해당 숫자가 짝수면
			loop(number/2); // loop에 /2 한 값으로 넘기기
		} else {
			loop(number*3+1); // 홀수이면 *3+1 결과 넘기기
		}
	}
    	 
}
