package Q1552;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1552
//@Memory 부동소수점 오차 문제 오류
public class Answer1 {
	//	double 형 실수(x)가 입력된다.
	//	소수 부분만 출력한다.

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String 타입으로 실수를 입력 받는다.
    	String number = br.readLine();

    	// .이 있는 위치를 찾는다.
    	int index = number.indexOf(".");
    	
    	String newNo = "0" + number.substring(index);
    	int length = newNo.length();
    	// 0.~ 총 16개의 숫자가 나와야 함으로
    	for (int i=16; i>length; i--) {
    		newNo+="0";
    	}
    	
        System.out.println(newNo);
    }
    
}