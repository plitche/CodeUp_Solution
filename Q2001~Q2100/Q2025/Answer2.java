package Q2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2025
//@Memory 11204, @Time 69
public class Answer2 {

	public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "/");
        
        // 년 월 일 입력받기
        String year = st.nextToken();
        String month = st.nextToken();
        String day = st.nextToken();
        
        char[] letters = new char[4];
        // 년도의 각 자리 숫자를 배열에 저장
        for (int i=0; i<year.length(); i++) {
        	letters[i] = year.charAt(i);
        }
        
        boolean isGoodDay = true;
        
        for (int i=0; i<4; i++) {
        	char checkLetter = (month+day).charAt(i); // 월+일(String) 의 각 자리 숫자를 찾아
        	
        	for (int j=0; j<4; j++) { // 배열에 저장된 년도의 숫자와 일치하는것이 있는지 체크
        		if (letters[j] == checkLetter) {
        			letters[j] = 'a'; // 있는 순간 다른 문자로 변환
        			break;
        		}
        	}
        	
        	int count = 0;
        	for (int j=0; j<4; j++) {
        		if (letters[j] == 'a') { // 변환한 a문자가 존재하는지 체크 후 count+=1
        			count++; 
        		}
        	}
        	
        	// count의 개수가 현재 for 반복문의 순번(+1)과 같지 않으면 다른 숫자가 있다는 뜻
        	if (count != i+1) {
        		isGoodDay = false;
        		break;
        	}
        }
        
        System.out.println(isGoodDay ? "yes" : "no");
	}
}
 