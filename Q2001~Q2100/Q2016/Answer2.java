package Q2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2016
//@Memory 11188, @Time 69
public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int length = Integer.parseInt(br.readLine());
        String number = br.readLine();
        
        char[] word = new char[number.length()];
    	// m 의 크기만큼 배열 생성
		int a = length%3;
		//컴마를 찍어줄 위치
		for(int i = 0; i < length; i++) {		
			//char 배열에 m글자를 1개씩 집어넣기	
			word[i] = number.charAt(i);
			//만약 n % 3 == 0 이라면 첫 컴마 생략
			if(a == 0) {
				a+=3;
			}
			if(i == a) {	
				//i가 a랑 같다면 a는 3증가, 그리고 컴마를 찍어줌.
				a += 3;
				sb.append(',');			
			}
			//숫자 출력
			sb.append(word[i]);
    
		}
		
		System.out.println(sb);
	}
}
