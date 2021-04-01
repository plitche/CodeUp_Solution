package Q1224;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1224
//@Memory 11196, @Time 92

public class Answer1 {
	//  분수의 크기를 비교하는 프로그램을 작성하시오.
	//  분수는 a / b  , c / d 모양으로 주어진다.
	//	a, b, c, d가 차례대로 입력으로 주어진다.(자연수)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        // int 타입이었기 떄문에 캐스팅 후 나누기
        double first = (double)a/b;
        double second = (double)c/d;
        
        // 3항 연산자 이용
        sb.append(first>second ? ">" : first<second ? "<" : "=");
        
        System.out.println(sb);
        br.close();
	}

}
