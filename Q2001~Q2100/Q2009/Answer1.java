package Q2009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2009
//@Memory 11184, @Time 66
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int coupone = Integer.parseInt(st.nextToken()); // 쿠폰 개수 입력 받기
        int count = Integer.parseInt(st.nextToken()); // 필요 쿠폰 개수 입력 받기
        
        int coffee = 0;
        while (coupone>=count) { // 잔여 쿠폰 개수가 필요 쿠폰 개수보다 많을때
        	int share = 0;
        	coffee += coupone/count; // 커피 개수를 잔여쿠폰/필요쿠폰 몫 만큼 더하기   
        	share = coupone/count; // 몫을 share변수에 저장
        	coupone = coupone%count+share; // 남은 쿠폰 개수를 잔여쿠폰%필요쿠폰 나머지에 그 몫을 더한다. 
        }
        
        System.out.println(coffee);
	}
    	 
}
