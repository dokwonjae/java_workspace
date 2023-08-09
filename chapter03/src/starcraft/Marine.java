package starcraft;

public class Marine extends Unit {

	public Marine(String name) {
		super(name);
		super.power =3;
		super.hp = 50;
	}
	
	public void attack(Zealot zealot) {
		zealot.beAttacked(power);
		System.out.println(name + "가 " + zealot.getName() + "을 공격합니다");
	}
	public void attack(Zergling zergling) {
		zergling.beAttacked(power);
		System.out.println(name + "가 " + zergling.getName() + "을 공격합니다");
	}
	
}
