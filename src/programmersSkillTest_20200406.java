
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class programmersSkillTest_20200406 {

	/*
	 * 문제 설명 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요. s는
	 * 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
	 * 
	 * 제한 사항 str은 길이 1 이상인 문자열입니다.
	 */

	public static String solution1(String s) {
		String answer = "";

		String[] sortArray = s.split("");

		// char[] sortArray = s.toCharArray();

		List sortList = new ArrayList();

		/*
		 * for(int i =0 ; i < s.length() ; i++) {
		 * 
		 * //sortList.add(s.charAt(i)); //sortArray.
		 * 
		 * }
		 */

		Arrays.sort(sortArray, Collections.reverseOrder());

		answer = String.join("", sortArray);

		return answer;
	}

	public static String solution2(String[] participant, String[] completion) {

		String answer = "";

		List<String> completionList = new ArrayList<>(Arrays.asList(completion));
		
		for (String participantOne : participant) {
			
			if (!solution2_1(participantOne, completionList)) {
				answer = participantOne;
			}
		}

		return answer;
	}

	public static boolean solution2_1(String participantOne, List<String> completionList) {
	
		boolean ishere = false;
		
		for (int i = 0 ; i < completionList.size() ; i++) {
			completionList.get(i);
			if (participantOne.equals(completionList.get(i))) {
				completionList.remove(i);
				ishere = true;
				break;
			}
			
		}
		
		return ishere;
	}
	/*
	 * 문제 설명 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다. 전화번호가 문자열
	 * phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수,
	 * solution을 완성해주세요.
	 * 
	 * 제한 조건 s는 길이 4 이상, 20이하인 문자열입니다.
	 */

	public static void main(String[] args) {

		
		String[] participant = {"leo", "kiki", "eden"}; String[] completion = {"eden", "kiki"};
		 

		//String[] participant = { "mislav", "stanko", "mislav", "ana" }, completion = { "stanko", "ana", "mislav" };

		System.out.println(solution2(participant, completion));

		// System.out.println(solution1("Zbcdefg"));

	}

}
