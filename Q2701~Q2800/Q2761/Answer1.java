package Q2761;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2601
//@Memory 11168, @Time 69
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        // 3가지 연산 결과 변수에 저장
        int sum = a+b;
        int minus = a-b;
        int multi = a*b;
        
        // 3항 연산자를 이용
        System.out.println(sum>minus ? (minus>multi ? minus : sum>multi ? multi : sum) : (sum>multi ? sum : multi>minus ? minus : multi));
        
	}
    	 
}

