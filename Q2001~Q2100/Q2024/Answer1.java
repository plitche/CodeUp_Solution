package Q2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2024
//@Memory 11180, @Time 67
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String number = br.readLine();
        
        boolean isExist = false;
        
        if (number.equals("0")) { // 먼저 입력받은 숫자가 0인지 먼저 체크
        	sb.append("영");
        } else {
        	 // 가장 뒤의 자리부터 for문 반복 : 가장 뒷 자리부터 하는 이유는 StringBuilder에 저장하는 순서 때문
        	for (int i=number.length()-1; i>=0; i--) {
        		 //각 자리 숫자를 charAt을 통해 얻어, switch문을 이용하여 해당 숫자를 문자로 저장
            	switch(number.charAt(number.length()-i-1)-48) {
            	case 1 : sb.append("일"); break;
            	case 2 : sb.append("이"); break;
            	case 3 : sb.append("삼"); break;
            	case 4 : sb.append("사"); break;
            	case 5 : sb.append("오"); break;
            	case 6 : sb.append("육"); break;
            	case 7 : sb.append("칠"); break;
            	case 8 : sb.append("팔"); break;
            	case 9 : sb.append("구"); break;
            	}
            	
            	// 해당 자리 숫자가 0이 아닐 때 해당 자리수의 길이를 통해 단위 저장
            	if (number.charAt(number.length()-i-1) != '0') {
            		switch(i) {
                	case 9 : sb.append("십"); isExist=true; break; // 억&만 단위를 위한 boolean 변수 true
                	case 8 : sb.append(""); isExist=true; break;
                	case 7 : sb.append("천"); isExist=true; break;
                	case 6 : sb.append("백"); isExist=true; break;
                	case 5 : sb.append("십"); isExist=true; break;
                	case 4 : sb.append(""); isExist=true; break;
                	case 3 : sb.append("천"); break;
                	case 2 : sb.append("백"); break;
                	case 1 : sb.append("십"); break;
                	case 0 : sb.append(""); break;
                	}
            	}
            	
            	// 억&만 단위를 위한 boolean 변수 true일 때
            	if (isExist) {
            		if (i==8) { // 해당 자리수를 통해 억&만 저장
            			sb.append("억");
            			isExist=false;
            		} else if(i==4) {
            			sb.append("만");
            		}	
            	}
            }
        }
        
        System.out.println(sb);
        
	}
}
 