package Q1554;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1554
//@Memory 11216, @Time 96

public class Answer1 {
	//	double 형 실수(x)가 입력된다.
	//	정수로 내림(flooring)한 값을 출력한다.

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	double number = Double.parseDouble(br.readLine()); 

        System.out.println((int)Math.floor(number));
    }
    
}