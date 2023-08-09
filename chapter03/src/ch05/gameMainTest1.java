package ch05;

import java.util.Iterator;

public class gameMainTest1 {

	public static void main(String[] args) {
		int a=1;
		double b=1.0;
		
		clawMachineGame[] games = new clawMachineGame[10];
		games[0] = new iphone("아이폰x");
		games[1] = new teddybear("쿼카인형");
		games[2] = new liquor("앱솔루트");
		
		for (int i = 0; i < games.length; i++) {
			if (games[i] != null) {
				games[i].showInfo();
				if(games[i] instanceof iphone) {
					int checkOrigin = ((iphone)(games[i])).price;
					System.out.println("가격은 : " + checkOrigin);
				}
			}
		}
	}

}
