package Q2061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2061
//@Memory 11192, @Time 67
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int floor = 0;
        switch(br.readLine()) { // 입력받은 문자에 따라 switch 조건문 진행
        case "A" : floor = 10; break; // A가 입력되었을떄 floor 10으로 저장
        case "S" : floor = 2; break; // S가 입력되었을떄 floor 2으로 저장
        case "O" : floor = 1; break; // O가 입력되었을떄 floor 1으로 저장
        }
        
        int t = Integer.parseInt(br.readLine()); // 평수 캐스팅하여 정수로 입력받기
        int x = Integer.parseInt(br.readLine()); // 무게 캐스팅하여 정수로 입력받기
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 돈과 풍선 개당 금액을 공백을 기준으로 입력받기
        int money = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(br.readLine()); // 한 풍선당 들수 있는 무게
        
        // 삼항연산자를 이용
        // (평수 + (층수*무게/한 풍선당 무게)*)가격   이 money+1 보다 큰 경우 No 작거나 같은경우 Yes
    	System.out.println((t + floor*x/w)*price > money +1 ? "No" : "Yes");	
    	
	}
}