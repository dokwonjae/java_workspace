package ch05;

import starcraft.*;

public class MainTest2 {

	public static void main(String[] args) {
		// Unit 이라는 배열에 저글링, 질럿, 마린을 담아 보세요
		// 실행도 시켜 봅시다.

		Unit zealot1 = new Unit("질럿1");
		Unit zergling1 = new Zergling("저글링1");
		Unit Marine1 = new Marine("마린1");

		Unit[] arrayUnits = new Unit[10];
		arrayUnits[0] = zealot1;
		arrayUnits[1] = zergling1;
		arrayUnits[2] = Marine1;

		for (int i = 0; i< arrayUnits.length; i++) {
			if(arrayUnits[i] != null) {
			System.out.println(arrayUnits[i].getName());
			}
		}
	}
}
