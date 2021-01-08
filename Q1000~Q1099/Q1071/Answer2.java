// URL : https://www.codeup.kr/problem.php?id=1071
// 풀이 : BufferedReader, StringBuilder
// 메모리 : 11144, 시간 62

package Q1071;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Answer2 {
	static boolean isContinue;
	static StringBuilder sb = new StringBuilder();
	
	public static boolean zeroEnd(int number) {
		if (number==0) {
			isContinue=false;
		} else {
			isContinue=true;
		}
		return isContinue;
	}
	
	public static void getNumber(String number) {
		int space = number.indexOf(" ");
		String a = number.substring(0, space);
		zeroEnd(Integer.parseInt(a));
		
		if (isContinue) {
			sb.append(a).append("\n");
			getNumber(number.substring(space+1));
		} else {
			return;
		}

	}
	
	public static StringBuilder result(String number) {
		getNumber(number);
		return sb;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(result(br.readLine()));
	}
	
}