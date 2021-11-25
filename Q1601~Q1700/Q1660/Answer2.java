package Q1660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1660
//@Memory 11160, @Time 65

public class Answer2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        // 문자열 String 의 메소드인 replace 활용
        sb.append(line.replace(',', ' '));
        
        System.out.println(sb);
        br.close();
    }
    	 
}