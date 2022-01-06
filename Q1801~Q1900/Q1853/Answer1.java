package Q1853;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1853
//@Memory 11196, @Time 69
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        //  시작,  종료,  합계
        loop(1, count, 0);
	}
	
	public static void loop(int start, int end, int total) {
		if (start>end) {
			System.out.println(total); // 시작이 종료보다 더 작으면 출력
		} else {
			loop(start+1, end, total+start); // 시작을 +1 해주어 재귀함수 호출
		}
		
	}
    	 
}