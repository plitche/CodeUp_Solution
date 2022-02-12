 package Q2031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2031
//@Memory 11156, @Time 67
public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String column = br.readLine();
        int length = column.length(); // 문자열의 길이 	
        int total = 0; // 결과값 초기화
        for (int i=0; i<length; i++) {
        	if (i>0) { // 첫자리가 아닐 때에
        		total += Math.pow(26, i)*(column.charAt(length-1-i)-64); // 26의 거듭제곱*해당 알파뱃 순서	
        	} else {
        		total += column.charAt(length-1-i)-64; // 첫자리 문자는 해당 자리 순서만 +
        	}
        }
        
        System.out.println(total);
	}
}
 