package Q2046;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2046
//@Memory 11180, @Time 69
public class Answer1 {
// 아직 못품
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), "/"); // 기준으로 할 파일의 절대경로를 / 기준으로 나누기
        StringTokenizer st2 = new StringTokenizer(br.readLine(), "/"); // 중요한 파일의 절대 경로를 / 기준으로 나누기
        
        String result = null;
        boolean isSame = true; // 동일한지 여부 true 로 초기화
        
        while(st2.hasMoreTokens()) {  // 두번째 중요한 파일의 절대경로를 / 로 나눈 token이 없을 때 까지 반복
        	String a = st1.nextToken(); // 기준 파일의 token
        	String b = st2.nextToken(); // 중요 파일의 token
        	
        	if (b.indexOf(".") == -1) { // 확장자명이 있는 .의 위치가 -1인 경우
        		if (a.equals(b)) { // a와 b가 같다면
        			result += "../"; // ../ 문자열 더하기
        			isSame = false;
        		} else {
        			result += b+"/"; // 다른 경우 b의 절대경로 + /
        		}
        	} else {
        		result += b; // 확장자명이 있는 .의 위치가 있다면, .을 포함한 확장자명을 바로 +
        	}
        }
        
        if (isSame) { // isSame이 True인 경우 : 일치하는 경로가 한번도 없었다.
        	int index = result.lastIndexOf('/');
        	System.out.println("./"+result.substring(index+1));	
        } else {
        	System.out.println("../"+result.substring(4));
        }
    		
	}
}
