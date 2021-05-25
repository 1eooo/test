package prac;

public class CodingAttack191208_1 {

	static short getNumber() {
		return (short) ((Math.random() * 45) + 1); // 45를 곱하여 범위를 0-44로 만든뒤 1을 더하여 범위늘림
	}

	public static void main(String[] args) {
		
		// 메소드를 활용해서, 1~45중 6개를 자동으로 뽑는 프로그램 작성.
		short[] lotto = { 0, 0, 0, 0, 0, 0 }; //short 형식 배열을 선언과 동시에 초기화
		
		short i, k, num; // 반복문에 쓰일 i, k / num : 추첨 숫자를 담을 변수
		
		char dupl = 'N'; // 중복여부를 판단하는 변수
		
		System.out.print("** 로또 추첨을 시작합니다. **\n\n");

		for (i = 0; i < 6; i++) { //0부터 5까지 6번 반복
		
			//추첨번호를 뽑는 부분
			num = getNumber(); // 랜덤함수를 실행해서 결과를 num에 담음.
			
			for (k = 0; k < 6; k++) { //0부터 5까지 6번 반복
				
				//기존 배열에 담긴 수와 새로 추첨된 수를 비교해서 중복된 값을 확인하는 부분
				if (lotto[k] == num) { // 랜덤함수로부터 입력받은 수가 lotto[k]에 담겨있는 수와 같다면(=중복이면)
					dupl = 'Y'; //dupl 변수에 Y를 넣음. (lotto배열의 k인덱스에 담긴 변수가 중복이라고 표시해주는 것)
				}
				
				//위에서 중복여부를 판단한 것을 기준으로 배열에 추첨번호를 넣는 부분
				if (dupl == 'N') { // dupl 변수가 N이면,(=중복값이 아니라면)
					lotto[i] = num; // num에 담긴 수(랜덤함수로부터 입력받은 수)를  lotto배열의 i번째에 넣음
					
				} else { // dupl값이 Y이면,(=중복값이면)
					dupl = 'N'; //아무것도 하지않고 중복여부만 N(초기값)으로 바꿔줌.
				}
			}
		}//배열 모든 요소에 추첨번호가 담길때까지 반복
		
		//배열에 담긴 추첨번호를 출력
		System.out.printf("추첨된 로또번호==> ");
		for (i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto[i]);
			System.out.println("");
		}
	}

}
