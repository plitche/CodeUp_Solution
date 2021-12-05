package Q1702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1702
//@Memory 11188, @Time 72

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String a = st.nextToken();
        String b = st.nextToken();
        String c = st.nextToken();
        
        // 홀수인지 판단하여 출력형태 3항 연산자 사용
        System.out.println(Integer.parseInt(b)%2 == 0 ? a+b+c+" "+a+b+c : a+b+c);
    }
    	 
}