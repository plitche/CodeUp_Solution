package Q1852;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1852
//@Memory 11172, @Time 95
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        loop(1, count);
	}
	
	public static void loop(int start, int end) {
		if (start>end) {
			return;
		} else {
			System.out.print(start + " ");
			loop(start+1, end);
		}
		
	}
    	 
}