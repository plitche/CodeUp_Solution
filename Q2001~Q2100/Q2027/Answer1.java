package Q2027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2027
//@Memory 11184, @Time 66
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        int[] numbers = new int[count]; // 입력받은 정수 숫자만큼 배열 길이 선정
        
        int last = 0;
        int first;
        int second;
        int sum = 1;
        
        for (int i=2; i<count; i++) { // index 2부터 for 반복문 시작
        	numbers[0] = 1; // 0번째 index 자리를 1로 초기화
            numbers[1] = 1; // 1번째 index자리를 1로 초기화
        	if (i == 2) {
        		last = 1; // index 가 2인 경우 1로 저장
        	} else {
        		last = sum;	// 이외의 경우 합계를 변수에 저장
        	}
        	
        	first = numbers[last-1]; // 첫번째를 마지막 index - 1 자리의 value로 저장
        	second = numbers[i-last]; // 두번쨰 변수를 index의 0 last 숫자 index의 value로 저장
        	sum = first+second; // 합계를 첫번째, 두번쨰 값의 합으로 저장
        	
        	numbers[i] = sum; // i번쨰 index value를 sum으로 저장
        }
        
        System.out.println(sum); // sum 출력
	}
}
 
