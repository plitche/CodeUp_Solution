package Q2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2025
//@Memory 11192, @Time 71 
public class Answer1 {

	public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "/");
        
        String year = st.nextToken();
        String month = st.nextToken();
        String day = st.nextToken();
        
        char[] letters = new char[4];
        for (int i=0; i<year.length(); i++) {
        	letters[i] = year.charAt(i);
        }
        
        for (int i=0; i<4; i++) {
        	char checkLetter = (month+day).charAt(i);
        	
        	for (int j=0; j<4; j++) {
        		if (letters[j] == checkLetter) {
        			letters[j] = 'a';
        			break;
        		}
        	}
        }
        
        boolean isGoodDay = true;
        for (int i=0; i<4; i++) {
        	if (letters[i] != 'a') {
        		isGoodDay = false;
        		break;
        	}
        }
        
        System.out.println(isGoodDay ? "yes" : "no");
	}
}
 