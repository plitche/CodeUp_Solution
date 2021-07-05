package Q2041;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2041
//@Memory 11420, @Time 66
public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int gap = 0;
        String[] name = new String[count];
        int[] months = new int[count];
        int[] dates = new int[count];
        
        for (int i=0; i<count; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	name[i] = st.nextToken();

        	int month = 0;
        	switch(st.nextToken()) {
        	case "January" : month = 1; break;
        	case "February" : month = 2; break;
        	case "March" : month = 3; break;
        	case "April" : month = 4; break;
        	case "May" : month = 5; break;
        	case "June" : month = 6; break;
        	case "July" : month = 7; break;
        	case "August" : month = 8; break;
        	case "September" : month = 9; break;
        	case "October" : month = 10; break;
        	case "November" : month = 11; break;
        	case "December" : month = 12; break;
        	}
        	
        	months[i] = month;
        	dates[i] = Integer.parseInt(st.nextToken().replace("th", "").replaceAll("st", "").replace("nd", "").replace("rd", ""));
        	if (i>0) {
        		if (months[i-1] > months[i]) {
        			gap++;
        		} else if (months[i-1] == months[i]) {
        			if (dates[i-1] > dates[i]) {
        				gap++;
        			}
        		}
        	}
        }
        if (count == 0) {
        	System.out.print("No difference.");	
        } else {
        	sb.append(name[0] + " is " + gap);
        	if (gap == 1) {
        		sb.append(" year older than ");
        	} else {
        		sb.append(" years older than ");
        	}
        	sb.append(name[count-1] + ".");
        	
        	System.out.print(sb);
        }
        
	}
}