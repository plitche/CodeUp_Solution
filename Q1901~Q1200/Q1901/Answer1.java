package Q1901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1901
//@Memory 11836, @Time 70
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        loop(1, count);
	}
	
	public static void loop(int index, int count) {
		
		if (index <= count) {
			System.out.println(index);
			loop(index+1, count);
		} else {
			return;
		}
		
	}
    	 
}
