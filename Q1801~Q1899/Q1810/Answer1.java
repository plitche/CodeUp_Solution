package Q1810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1810
//@Memory 11172, @Time 68
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int start = Integer.parseInt(st.nextToken()); // 자를 시작 문자 자리
        int end = Integer.parseInt(st.nextToken());	// 자를 마지막 문자 자리
        
        System.out.println(line.substring(start-1, end)); // substring을 이용한 String 자르기
        
	}
    	 
}
