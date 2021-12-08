package Q1709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1709
//@Memory 11328, @Time 68

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int many = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] numbers = new int[many]; // 입력받는 길이만큼 배열 길이 선언
        for (int i=0; i<many; i++) {
        	numbers[i] = Integer.parseInt(st.nextToken()); // 토큰에서 하나씩 꺼내서 배열에 저장
        }
        
        Arrays.sort(numbers); // 정렬
        
        for (int i=many-1; i>=0; i--) {
        	sb.append(numbers[i]).append(" ");
        }
 
        System.out.println(sb);
    }
    	 
}