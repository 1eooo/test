package prac;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

	
	
	
	
	public static void main(String[] args) {
		
		int len = (int)(Math.random() * 10) + 1;
		
		//System.out.println(len);
		//System.out.println(len*len);
		
		List<Integer> bingoList = new ArrayList<>();
		
		for(int i = 0 ; i < (len*len) ; i++) {
			//System.out.println(i+1);
			bingoList.add(i, i+1);
		}
		
		for(int i = 0 ; i < (len*len) ; i++) {
			
			System.out.print(bingoList.get(i)+"\t");
			//System.out.print(i%len);
			
			if((i+1)%len == 0) {
				
				System.out.println("");
				
			}
			
		}
				
		
		
		
	}
	
}
