package Q2601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2601
//@Memory 11164, @Time 67
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine()); // 
        
        int[] arr = new int[count]; // 입력받은 count 개수만큼 배열의 길이 초기화
        if (count == 1 || count == 2) { // 입력받은 count 1,2 인 경우 1출력
        	System.out.print(1);
        } else {
        	arr[0] = 1; // 배열의 첫번째 자리와 두번째 자리 1로 초기화
        	arr[1] = 1;
        	for (int i=2; i<count; i++) { // 배열의 첫번째와 두번째자리를 초기화 했음으로 2부터 반복 시작
        		arr[i] = arr[i-1]+arr[i-2]; // 수열의 규칙에 따라 계산하여 배열의 index자리 값 저장
        	}
        	
        	System.out.print(arr[count-1]); // 마지막 자리 출력
        }
        
	}
    	 
}

