package Q2506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2204
//@Memory 56604, @Time 533
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double number = Double.parseDouble(br.readLine()); // 숫자 입력받기 (double 타입으로)
        
        number *= 100; // 해당 숫자에서 * 100
        int a = (int) Math.round(number); // 반올림
        int b = 10000;
        
        int index=a; // index 변수를 a로 초기화 선언
        while(index!=1) { // 위에 선언한 index가 1이 될때까지 반복 (모든 정수는 1로 나누어 떨어짐으로 -> 1로 나누어 떨어지지 않을 때 까지 반복)
        	if (a%index==0 && b%index==0) { // a와 b가 index로 나누어 떨어지면
        		a /= index; // index의 몫으로 변수 저장
        		b /= index;
        	}
        	
        	index--; // index를 증감 하기
        }
        
        System.out.print(a + "/" + b); // 최종적으로 while문이 종료되면 더이상 나누어 떨어지지 않음. -> 출력
        
	}
    	 
}

