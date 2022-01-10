package Q1935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1935
//@Memory 11148, @Time 69
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(loop(a, b));
	}
	
	public static int loop(int a, int b) {
		if (a==b) { // 동일한 숫자가 되면 a를 리턴하고 멈춘다.
			return a;
		} else if(a>b) { // a가 b보다 크면 a를 /2 해서 파라미터로 넘긴다.
			return loop(a/2, b);
		} else {
			return loop(a,b/2); // 반대의 경우  b를 2로 나눈다.
		}
	}
    	 
}
