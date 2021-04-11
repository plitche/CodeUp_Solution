package Q1285;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1285
//@Memory 11164, @Time 75

public class Answer1 {
	//	이번에는 식을 입력하면 차례대로 계산하여 출력하는 계산기를 만들어보자.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st1 = new StringTokenizer(line, "+");
        int a = Integer.parseInt(st1.nextToken());	//첫번째 숫자
        
        StringTokenizer st2 = new StringTokenizer(st1.nextToken().substring(0), "-");
        int b = Integer.parseInt(st2.nextToken());	//두번째 숫자
        
        StringTokenizer st3 = new StringTokenizer(st2.nextToken().substring(0), "*");
        int c = Integer.parseInt(st3.nextToken());	//세번째 숫자
        
        StringTokenizer st4 = new StringTokenizer(st3.nextToken().substring(0), "/");
        int d = Integer.parseInt(st4.nextToken());	//네번째 숫자

        StringTokenizer st5 = new StringTokenizer(st4.nextToken().substring(0), "=");
        int e = Integer.parseInt(st5.nextToken());	//다섯번째 숫자

        System.out.println((a+b-c)*d/e);
        br.close();
	}
	
}