package Q1851;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1851
//@Memory 11156, @Time 68
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        loop(count); // 재귀함수 호출 : 별의 개수를 파라미터로 넘긴다.
	}
	
	public static void loop(int i) {
		if (i==0) { // 파라미터가 0 이되면 멈춘다.
			return;
		} else {
			System.out.print("*"); // 별 출력
			loop(i-1); // 파라미터 반복횟수를 -1하여 다시 재귀함수 호출
		}
		
	}
    	 
}
