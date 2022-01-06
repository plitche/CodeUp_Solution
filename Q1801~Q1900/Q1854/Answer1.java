package Q1854;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1854
//@Memory 11156, @Time 68
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine(); // 어짜피 charAt을 이용할것이기 때문에 문자열로 받는다.
        
        // 인덱스, 입력받은 숫자, 총 합
        loop(0, number, 0);
	}
	
	public static void loop(int index, String number, int total) {
		
		if (index==number.length()) {
			System.out.println(total);
		} else {
			// 각자리 숫자를 charAt을 이용하여 더한다.
			loop(index+1, number, total+number.charAt(index)-48);
		}
		
	}
    	 
}
