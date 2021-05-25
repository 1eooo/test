package prac;

import java.util.Scanner;

public class CodingAttack191208 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int ja = 0;
		int mo = 0;
		
		String[] array_word;
		
		System.out.println("문자열을 입력하세요");
		
		String word = sc.nextLine();
		array_word = word.split("");

		for (int i = 0; i < array_word.length; i++) {
			if ((array_word[i].equals("a")) 
					|| (array_word[i].equals("o")) 
					|| (array_word[i].equals("e"))
					|| (array_word[i].equals("i"))
					|| (array_word[i].equals("u")))
				mo = mo + 1;
			else
				ja = ja + 1;
		}
		System.out.println("이 문자열의 "+"\n"+"자음의 개수는 : " + ja +"\n"+ "모음의 개수는 : " + mo);
	}

}
