package starcraft;

public class Zealot extends Unit {

	public Zealot(String name) {
		super(name);
		super.power = 5;
		super.hp = 80;
	}

	public void attack(Marine marine) {
		marine.beAttacked(power);
		System.out.println(name + "가 " + marine.getName() + "을 공격 합니다");
	}
	public void attack(Zergling zergling) {
		zergling.beAttacked(super.power);
		System.out.println(name + "가" + zergling.getName() + "을 공격 합니다.");
	}
	
	
} // end of class
