package ch05;

import java.util.Random;

public class RandomeGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		int selected = random.nextInt(3) + 1;
		String[] strings = new String[3];
		strings[0] = "곰인형";
		strings[1] = "아이폰";
		strings[2] = "호돌이";
		System.out.println(strings[selected]);
	}

}
