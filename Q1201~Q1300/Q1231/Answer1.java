package Q1231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1231
//@Memory 14264, @Time 105

public class Answer1 {
	//	연산식이 한줄로 입력된다.
	//	연산식의 형식은 정수+정수 또는 정수-정수 또는 정수*정수 또는 정수/정수의 형태이다.
	//	계산 결과를 정수로 출력한다. 나눗셈일 경우 실수로 출력하되 소수 둘째자리까지 출력한다.
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        
        StringTokenizer st;
        // indexOf은 해당 문자가 없는 경우 -1을 반환한다.
        if (str.indexOf('+') != -1) {
        	st = new StringTokenizer(str, "+");	// + 기준으로 나누기
        	sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));	// + 연산
        } else if (str.indexOf('-') != -1) {
        	st = new StringTokenizer(str, "-");	// - 기준으로 나누기
        	sb.append(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));	// - 연산
        } else if (str.indexOf('*') != -1) {
        	st = new StringTokenizer(str, "*");	// * 기준으로 나누기
        	sb.append(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));	// * 연산
        } else {
        	st = new StringTokenizer(str, "/");	// / 기준으로 나누기
        	sb.append(String.format("%.2f", Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken())));	// / 연산
        }
        	
        System.out.println(sb);
        br.close();
    }

}
