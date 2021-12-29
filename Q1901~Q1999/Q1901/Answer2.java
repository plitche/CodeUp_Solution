package Q1901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1901
//@Memory 11196, @Time 61
public class Answer2 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        loop(1, count);
        System.out.println(sb);
	}
	
	public static void loop(int index, int count) {
		
		if (index <= count) {
			sb.append(index + "\n");
			loop(index+1, count);
		} else {
			return;
		}
		
	}
    	 
}
