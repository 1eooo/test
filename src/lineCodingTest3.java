
public class lineCodingTest3 {

	public static int solution(String road, int n) {
		int answer = -1;

		
		
		String tempRoad = road;
		
		int repCnt = n;
		
		for (int i = 0; i < road.length(); i++) {

			if (road.charAt(i) == '0' && repCnt > 0) {
				
				tempRoad = tempRoad.substring(0, i)+"1"+tempRoad.substring(i+1, tempRoad.length());
				
				repCnt--;
								
			} 			
			
		}
		System.out.println(road);
		System.out.println(tempRoad);
		
		
		int tempLength = 0;
		int roadLength = 0;

		for (int i = 0; i < tempRoad.length(); i++) {

			if (tempRoad.charAt(i) == '1') {
				tempLength++;
			} else {
				if (roadLength < tempLength) {
					roadLength = tempLength;
				}
				tempLength = 0;
			}

			if (roadLength < tempLength) {
				roadLength = tempLength;
			}

		}

		answer = roadLength;

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("111011110011111011111100011111", 3));
	}

}
