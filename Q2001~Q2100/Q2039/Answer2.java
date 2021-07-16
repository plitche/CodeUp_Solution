package Q2039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2039
//@Memory 14148, @Time 112
public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int startHour = Integer.parseInt(st.nextToken());
        int startMin = Integer.parseInt(st.nextToken());
        int classMin = Integer.parseInt(st.nextToken());
        int breakMin = Integer.parseInt(st.nextToken());
        int classCount = Integer.parseInt(st.nextToken());
        int whenLunch = Integer.parseInt(st.nextToken());
        int lunchMin = Integer.parseInt(st.nextToken());
        
        boolean isLunch = false;
        for (int i=0; i<classCount; i++) {
        	sb.append(startHour + ":" + String.format("%02d",startMin) + "-");
        	
        	startMin+=classMin;
        	int plusHour = 0;
        	if (startMin>=60) {
        		plusHour=1;
        		startMin%=60;
        	}
        	
        	startHour+=plusHour;
        	sb.append(startHour + ":" + String.format("%02d",startMin) + " " + (i+1) + "교시");
        	
        	if (i!=classCount-1) {
        		sb.append("\n");
        	}
        	
        	if (i+1!=whenLunch) {
        		startMin+=breakMin;
        		if (startMin>=60) {
        			startHour+=1;
            		startMin%=60;
            	}
        	}
        	
        	if (!isLunch) {
        		if (i+1==whenLunch || i+1==classCount) {
        			if (i+1==classCount ) {
        				sb.append("\n");
        			}
            		sb.append(startHour + ":" + String.format("%02d",startMin) + "-");
            		
            		plusHour = 0;
            		startMin+=lunchMin;
                	if (startMin>=60) {
                		plusHour=startMin/60;
                		startMin%=60;
                	}
                	startHour+=plusHour;
                	
            		sb.append(startHour + ":" + String.format("%02d",startMin) + " 점심시간" + "\n");
            		
            		isLunch = true;
            	}	
        	}
        	
        }
        
        System.out.println(sb);
	}
}
 