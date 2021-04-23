package Q1407;

import java.io.IOException;
import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1407
//@Memory 12412, @Time 97

public class Answer1 {
	//	길이(글자수)가 100이하인 문자열을 입력받아 공백을 제거하고 출력하시오.
	 
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<line.length(); i++) {
            if (line.charAt(i)==' ') {
                continue;
            } else {
                sb.append(line.charAt(i));
            }
        }
        System.out.println(sb);
        sc.close();
    }
	
}