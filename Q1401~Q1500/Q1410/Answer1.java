package Q1410;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1410
//@Memory 12484, @Time 85

public class Answer1 {
	//	여는 괄호의 개수와 닫힌 괄호의 개수를 출력한다.
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int left=0;
        int right=0;

        for (int i=0; i<line.length(); i++) {
            if (line.charAt(i)==40) {
                left+=1;
            } else {
                right+=1;
            }
        }
        System.out.println(left + " " + right);
    }
	
}