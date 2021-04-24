package Q1411;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1411
//@Memory 11128, @Time 90

public class Answer1 {
	//	여러분은 주 어진 카드 묶음에서 빠진 하나의 카드를 찾아서 그 번호를 출력해야 한다.
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 카드의 개수만큼 배열의 길이 지정
        int[] cards = new int[n];
        
        // 카드한장을 잃어버렸으니 n-1만큼 for문 반복
        for (int i=0; i<n-1; i++) {
        	// 잃어버린 카드가 아니면 해당 카드번호 index에 1을 넣어준다.
        	cards[Integer.parseInt(br.readLine())-1] = 1;
        }
        
        for (int i=0; i<n; i++) {
        	// 잃어버린 카드 (index가 0인 자리를 찾아서 출력한다.
        	if (cards[i]==0) {
        		System.out.println(i+1);
        		break;
        	}
        }
        
    }
	
}