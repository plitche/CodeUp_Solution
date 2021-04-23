package Q1408;

import java.io.IOException;
import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1408
//@Memory 12424, @Time 124

public class Answer1 {
	//	인터넷 서비스들은 대부분 아이디와 패스워드(password)를 이용한다.
	//	이때 사용되는 패스워드는 여러 가지 방법으로 암호화되어 저장된다.
	//	[어떤 인터넷 서비스의 2가지 암호화 방법]
	//	- 입력받은 문자의 ASCII 코드값 + 2
	//	- (입력받은 문자의 ASCII 코드값 * 7) % 80 + 48
	 
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
        String word = sc.nextLine();
        
        // 첫번째 단어 암호화
        for (int i=0; i<word.length(); i++) {
        	sb.append((char)(word.charAt(i)+2));
        }
        sb.append("\n");

        // 두번째 단어 암호화
        for (int i=0; i<word.length(); i++) {
        	sb.append((char)(word.charAt(i)*7%80+48));
        }
        
        System.out.println(sb);
        sc.close();
    }
	
}