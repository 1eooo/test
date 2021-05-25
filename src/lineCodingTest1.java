

public class lineCodingTest1 {
	

	public static int solution(String inputString) {

		int bra1 = 0, bra3 = 0, bra5 = 0, bra7 = 0;
		int bra2 = 0, bra4 = 0, bra6 = 0, bra8 = 0;

		int answer = -1;
		int tempAnswer = 0;

		for (int i = 0; i < inputString.length(); i++) {
			inputString.charAt(i);

			if (inputString.charAt(i) == '[') {
				bra1++;
				for (int j = 0; j < inputString.length(); j++) {
					if (inputString.charAt(j) == ']') {
						bra2++;
						if (i > j) {
							return answer;
						}
					}
				}
			}

			if (inputString.charAt(i) == '{') {
				bra3++;
				for (int j = 0; j < inputString.length(); j++) {
					if (inputString.charAt(j) == '}') {
						bra4++;
						if (i > j) {
							return answer;
						}
					}
				}
			}
			if (inputString.charAt(i) == '(') {
				bra5++;
				for (int j = 0; j < inputString.length(); j++) {
					if (inputString.charAt(j) == ')') {
						bra6++;
						if (i > j) {
							return answer;
						}
					}
				}
			}
			if (inputString.charAt(i) == '<') {
				bra7++;
				for (int j = 0; j < inputString.length(); j++) {
					if (inputString.charAt(j) == '>') {
						bra8++;
						if (i > j) {
							return answer;
						}
					}
				}
			}

		}

		{
			if (bra1 == bra2) {
				tempAnswer += bra1;
			} else {
				return answer;
			}

			if (bra3 == bra4) {
				tempAnswer +=bra3;
			} else {
				return answer;
			}

			if (bra5 == bra6) {
				tempAnswer +=bra5;
			} else {
				return answer;
			}

			if (bra7 == bra8) {
				tempAnswer +=bra7;
			} else {
				return answer;
			}

			answer = tempAnswer;
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "line [plus]";
		System.out.println(solution(inputString));
	}

}
