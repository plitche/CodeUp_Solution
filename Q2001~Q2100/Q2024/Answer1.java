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
        
        if (number.equals("0")) {
        	sb.append("영");
        } else {
        	for (int i=number.length()-1; i>=0; i--) {
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
            	
            	if (number.charAt(number.length()-i-1) != '0') {
            		switch(i) {
                	case 9 : sb.append("십"); isExist=true; break;
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
            	
            	if (isExist) {
            		if (i==8) {
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
 