package Q1854;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1854
//@Memory 11136, @Time 109
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        
        loop(0, number, 0);
	}
	
	public static void loop(int index, String number, int total) {
		
		if (index==number.length()) {
			System.out.println(total);
		} else {
			loop(index+1, number, total+number.charAt(index)-48);
		}
		
	}
    	 
}
