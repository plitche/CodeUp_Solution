package Q1852;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1852
//@Memory 11212, @Time 74
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        loop(1, count);
	}
	
	public static void loop(int start, int end) {
		if (start>end) { // 종료되는 시점보다 커지면 종료
			return;
		} else {
			System.out.print(start + " "); // 재귀함수가 호출될 때 마다 숫자 출력
			loop(start+1, end); // 파라미터로 시작 숫자를 1높히고, 종료되는 숫자 넘기기
		}
		
	}
    	 
}