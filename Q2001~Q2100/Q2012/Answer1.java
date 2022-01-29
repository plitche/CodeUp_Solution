package Q2012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2012
//@Memory 59992, @Time 604
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken()); // 시작 수
        int b = Integer.parseInt(st.nextToken()); // 마지막 수
        
        int count = 0;
        for (int i=a; i<=b; i++) { // a부터 b까지 for문 반복
        	for (int j=0; j<String.valueOf(i).length(); j++) { // 각 자리 숫자 length만큼 반복문
        		if (String.valueOf(i).charAt(j) == '1') {
        			count++;
        		}
        	}
        }
        
        
        System.out.println(count);
	}
    	 
}
