package starcraft;

public class MainTest1 {

	public static void main(String[] args) {
		Zealot zealot1 = new Zealot("질");
		Zealot zealot2 = new Zealot("럿");
		
		Marine marine1 = new Marine("마");
		Marine marine2 = new Marine("린");
		
		Zergling zergling1 = new Zergling("저"); 
		Zergling zergling2 = new Zergling("글"); 
		Zergling zergling3 = new Zergling("링");
		
		zergling1.showInfo();
		marine1.showInfo();
		zealot1.showInfo();
		
		int cnt=0;
		
		for(int i=1;i<17;i++) {
			marine1.attack(zergling1);
			cnt++;
		}
//		while(true) {
//		marine1.attack(zergling1);
//		cnt++;
//		if(zergling1.getHp() <= 0) {
//			break;
//		}
		
//		}
//		
//		marine1.attack(zealot1);
//		zealot1.attack(zergling1);
//		

		zergling1.showInfo();
		marine1.showInfo();
		zealot1.showInfo();
		System.out.println(cnt);
	}

}
