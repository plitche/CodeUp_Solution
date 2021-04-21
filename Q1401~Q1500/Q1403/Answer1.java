package Q1403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1403
//@Memory 11168, @Time 94

public class Answer1 {
	//	k개의 숫자를 입력받고 그 숫자들을 두번 출력하시오.
	 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();

        // 입력받은 숫자의 *2 개수만큼 배열의 길이를 선언한다.
        int[] numbers = new int[Integer.parseInt(br.readLine())*2];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 반복문을 통해서 배열에 숫자 저장
        for (int i=0; i<numbers.length/2; i++) {
        	int newNum = Integer.parseInt(st.nextToken());
        	// 입력을 받을 때 마다 배열에 저장 (인덱스 i, i+n)
        	numbers[i] = newNum;
        	numbers[i+numbers.length/2] = newNum;
        }
        
        for (int i=0; i<numbers.length; i++) {
        	sb.append(numbers[i]).append("\n");
        }
        
        System.out.println(sb);
    }
	
}