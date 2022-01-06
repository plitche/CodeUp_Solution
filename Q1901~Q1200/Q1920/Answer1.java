package Q1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1920
//@Memory 11144, @Time 66
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        System.out.println(Integer.toBinaryString(number)); // 입력받은 숫자를 2진수 변환
	}
    	 
}
