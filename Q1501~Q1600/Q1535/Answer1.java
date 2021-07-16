package Q1535;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1535
//@Memory 11240, @Time 117
public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 가장 큰 수를 0으로 초기화
        int max = 0;
        int index = 1;
        for (int i=0; i<length; i++) {
        	int number = Integer.parseInt(st.nextToken());
        	if (max<number) {
        		max = number;
        		index = i+1;
        	}
        }
        
        System.out.println(index);
    	
    }
    
}