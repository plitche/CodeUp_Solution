package Q1292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1292
//@Memory 11200, @Time 105

public class Answer1 {
	//	도둑의 DNA의 특징은 DNA의 모든 숫자의 합을 7로 나눈 나머지가 4라는 사실을 알았다.
	//	DNA 샘플을 분석하여 이 자가 도둑인지 아닌지를 판단하여 만약 도둑이라면 “suspect”, 아니면 “citizen”을 출력하는 프로그램을 작성하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String DNA = br.readLine();
		
		int sum = 0;
		for (int i=0; i<DNA.length(); i++) {
			sum += Integer.parseInt(DNA.substring(i, i+1));
		}
		
		System.out.println(sum%7==4 ? "suspect" : "citizen ");
		br.close();
	}
	
}