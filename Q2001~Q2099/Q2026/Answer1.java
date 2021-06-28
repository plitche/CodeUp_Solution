package Q2026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2026
//@Memory 11152, @Time 67 (숫자 범위를 벗어나기 때문에 오류)
public class Answer1 {

	public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String number = br.readLine();
        Long number2 = Long.valueOf(number, 16);	// 16 => 10진수
        String number3 = Long.toBinaryString(number2);	// 10 => 2진수
        
        if (number3.length()<12) {
        	for (int i=0; i<12-number3.length(); i++) {
        		number3 = "0"+number3;
            }	
        } 
        
        for (int i=0; i<12; i++) {
        	if (i>0 && i%4==0) {
        		sb.append(" ").append(number3.charAt(i)-48);
        	} else {
        		sb.append(number3.charAt(i)-48);	
        	}
        	
        }
        
        System.out.println(sb);
	}
}
 