package Q2001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2001
//@Memory 11296, @Time 72
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] pasta = new int[3]; // 파스타와 쥬스의 가격을 저장할 배열 선언
        int[] juice = new int[2];
        
        double price = 0;
        for (int i=0; i<5; i++) {
        	if (i<3) { // 순서대로 저장하되 3개까지만 pasta 배열에 저장
        		pasta[i] = Integer.parseInt(br.readLine());
        	} else {
        		juice[i-3] = Integer.parseInt(br.readLine());
        	}
        }
        
        Arrays.sort(pasta); // 정렬
        Arrays.sort(juice);
        
        price = pasta[0] + juice[0]; // 최소 금액 더하기
        
        System.out.println(price + price/10); // 출력
	}
    	 
}
