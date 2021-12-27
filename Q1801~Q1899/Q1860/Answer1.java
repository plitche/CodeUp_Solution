package Q1860;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1860
//@Memory 11224, @Time 67
public class Answer1 {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        
        enter(line); // 층수를 줄띄우기(enter) 메소드로 보낸다.
        System.out.print(sb);
	}
	
	public static void enter(int line) {
		if(line<=0) { // 남은 층이 0개이면 멈추기
			return;
		}
		
		enter(line-1); // 층을 -1하여 재귀함수 호출
		loop(line); // 층을 띄울때마다 loop함수 호출
		sb.append("\n");
	}
	
	public static void loop(int line) {
		if (line<=0) { // 남은 층이 0개이면 멈추기
			return;
		}
		
		loop(line-1); // 층을 -1하여 loop매소드 재귀함수 호출
		sb.append(line + " "); // 숫자찍기
	}
    	 
}
