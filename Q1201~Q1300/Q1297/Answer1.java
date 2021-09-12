package Q1297;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1297
//@Memory 11176, @Time 69

public class Answer1 {
	//	그림과 같이 길이가 n인 철판을 구부려서 단면이 직사각형인 ㄷ자 모양을 만들려고 한다.
	//	이 ㄷ자 모양을 수직으로 자른 단면의 넓이 S를 최대로 하려면 양 끝에서 얼마만큼 구부려야 하는지 계산하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		
		int wide = 0;
		for (int i=1; i<length; i++) {	// 입력받은 길이만큼 for문을 반복하지만 사실 중간에 종료됨
			// i를 for문을 통해 1씩 증가시키면서 계산
			if (wide < (length-(i*2)) * i) {	// 넓이가 wide보다 크면 계속해서 갱신	
				wide = (length-(i*2)) * i;	
			} else {	// 넓이가 wide보다 작아지는 시점에 바로 break;
				System.out.println(i-1);
				break;
			}
		}
		
		br.close();
	}
	
}
