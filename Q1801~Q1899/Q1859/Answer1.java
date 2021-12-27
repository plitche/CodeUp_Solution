package Q1859;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1859
//@Memory 11188, @Time 68
public class Answer1 {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        
        enter(line); // 층수를 줄띄우기(enter) 메소드로 보낸다.
        System.out.print(sb);
	}
	
	public static void enter(int line) {
		if(line<=0) { // 남은 줄이 0이면 멈추기
			return;
		}
		
		enter(line-1); // 라인을 -1해준다.
		loop(line); // 별을 찍기위한 loop 메소드에 라인을 보낸다.
		sb.append("\n"); // 줄 띄우기
	}
	
	public static void loop(int line) {
		if (line<=0) { // 라인이 0이되면 별을 그만찍는다 : 리턴한다.
			return;
		}
		
		loop(line-1); // 라인-1하여 재귀함수 호출
		sb.append("*");
	}
    	 
}
