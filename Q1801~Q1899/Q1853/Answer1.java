package Q1853;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1853
//@Memory 11172, @Time 95
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        loop(1, count, 0);
	}
	
	public static void loop(int start, int end, int total) {
		if (start>end) {
			System.out.println(total);
		} else {
			loop(start+1, end, total+start);
		}
		
	}
    	 
}