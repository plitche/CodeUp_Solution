package Q1402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1402
//@Memory 11160, @Time 72

public class Answer1 {
	//	첫째 줄에 데이터의 개수 n이 입력된다. ( n <= 1,000 )
	//	둘째 줄에 공백을 기준으로 n개 데이터가 입력된다.
	//	n개의 데이터를 입력의 역순으로 출력한다.
	 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();

        // 입력받은 숫자의 개수만큼 배열의 길이를 선언한다.
        int[] numbers = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 반복문을 통해서 배열에 숫자 저장
        for (int i=0; i<numbers.length; i++) {
        	numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i=0; i<numbers.length; i++) {
        	// 배열의 마지막 index부터 하나씩 줄여나가며 append
        	sb.append(numbers[numbers.length-1-i] + " ");
        }
        
        System.out.println(sb);
    }
	
}