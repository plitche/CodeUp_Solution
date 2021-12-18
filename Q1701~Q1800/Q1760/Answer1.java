package Q1760;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1760
//@Memory 11172, @Time 64

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String Line = br.readLine();
        String phoneNum = br.readLine();

        char[] numbers = new char[10];
        for (int i=0; i<numbers.length; i++) {
        	numbers[i] = Line.charAt(i); // 각자리의 문자를 배열에 저장
        }
        
        // 해당 문자가 일치하는지 조건문을 이용하여 번호를 저장
        for (int i=0; i<phoneNum.length(); i++ ) {
        	if (phoneNum.charAt(i) == ' ') sb.append(' ');
        	if (phoneNum.charAt(i) == numbers[0]) sb.append('0');
        	if (phoneNum.charAt(i) == numbers[1]) sb.append('1');
        	if (phoneNum.charAt(i) == numbers[2]) sb.append('2');
        	if (phoneNum.charAt(i) == numbers[3]) sb.append('3');
        	if (phoneNum.charAt(i) == numbers[4]) sb.append('4');
        	if (phoneNum.charAt(i) == numbers[5]) sb.append('5');
        	if (phoneNum.charAt(i) == numbers[6]) sb.append('6');
        	if (phoneNum.charAt(i) == numbers[7]) sb.append('7');
        	if (phoneNum.charAt(i) == numbers[8]) sb.append('8');
        	if (phoneNum.charAt(i) == numbers[9]) sb.append('9');
        }
        
        System.out.println(sb);
	}
    	 
}