package Q2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2016
//@오답 : number의 범위가 숫자 제한보다 넘은 크기가 입력될 수 있음으로 
public class Answer1 {
	
	public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); // 입력은 받지만 사실 사용하지 않는다.
        int number = Integer.parseInt(br.readLine());
        
        // getInstance() 에 아무 것도 넣지 않으면 미국 스타일이 default 설정이 되어 천 단위로 콤마(,)가 찍힌다.
		System.out.println(NumberFormat.getInstance().format(number));
	}
}
