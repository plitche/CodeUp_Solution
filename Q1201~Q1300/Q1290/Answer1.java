package Q1290;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1290
//@Memory 11152, @Time 89

public class Answer1 {
	//	대나무의 원래의 길이를 n이라고 할 때, 이 대나무를 어떤 길이로 잘랐을 때 이 길이가 n의 약수이면 이 대나무는 좋은 소리를 내는 악기가 될 수 있다.(단, 반드시 한 번 이상은 잘라야 대금을 만들 수 있다)
	//	대나무의 원래 길이가 주어질 때, 좋은 소리를 내는 서로 다른 대나무 조각의 수를 구하는 프로그램을 작성하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		
		// 좋은 대금의 종류의 수 0으로 초기화 선언
		int count = 0;
		// 최소한 한번 이상을 잘라야 하기 때문에 length보다 작은만큼 for문을 반복해야 한다.
		for (int i=1; i<length; i++) {
			if (length%i==0) {
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
	
}