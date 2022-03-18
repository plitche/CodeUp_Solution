package Q2081;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2081
//@Memory 11168, @Time 66
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = Integer.parseInt(br.readLine()); // 첫번 째 입력된 숫자를 max로 초기화
        int index = 1; // index 초기화
        for (int i=0; i<8; i++) { // 8번 반복
        	int number = Integer.parseInt(br.readLine()); // 반복할때 마다 정수 입력받기
        	if (number > max) { // 입력받은 숫자가 max 보다 크면 
        		max = number; // max를 입력받은 새로운 숫자로 바꿈
        		index = i+2;
        	}
        }
        
        System.out.println(max + "\n" + index);	
    	
	}
}