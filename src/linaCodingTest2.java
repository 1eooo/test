import java.util.ArrayList;
import java.util.List;

public class linaCodingTest2 {

	
	
	
    public static int solution(String answer_sheet, String[] sheets) {
        
    	
    	//의심문항
    	List<List<String>> tempList = new ArrayList();
    	
    	
    	
    	for( int i = 0 ; i < answer_sheet.length() ; i++) {
    		
    		char tempNum = answer_sheet.charAt(i);
    		
    		int susNum = 0;
    		
    		for(int j = 0 ; j < sheets.length ; j++) {
    			
    			if(tempNum == sheets[j].charAt(i)) {
    				susNum++;
    			}
    			
    		}
    		
    		
    		
    	}
    	
    	
    	
    	//부정행위 가능성 지수 = 총 의심문항의 수 + 가장 긴 연속된 의심문항의 수^2
    	
    	
    	
    	
    	
    	
    	
    	int answer = -1;
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer_sheet = "24551";
		
		String[] sheets = {"24553", "24553", "24553", "24553"};
		
		System.out.println(solution(answer_sheet, sheets));
	}

}
