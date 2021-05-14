package Q1536;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1536
//@Memory 11156, @Time 93
public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 가장 작은 수를 int타입의 max 값 으로 초기화
        int min = Integer.MAX_VALUE;
        for (int i=0; i<length; i++) {
        	int number = Integer.parseInt(st.nextToken());
        	if (min>number) {
        		min = number;
        	}
        }
        
        System.out.println(min);
    	
    }
    
}