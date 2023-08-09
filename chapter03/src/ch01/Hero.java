package ch01;

public class Hero {
	int hp;
	int damage;
	
	public static void main(String[] args) {
		
		warrior wa = new warrior();
		wa.hp = 100;
		System.out.println(wa.hp);
		
		archer ar = new archer();
		ar.hp = 80;
		System.out.println(ar.hp);
		
		wizard wi = new wizard();
		wi.hp = 50;
		System.out.println(wi.hp);
		System.out.println(wi.damage);
		
	}
}

class warrior extends Hero{
	
}
class archer extends Hero{
	
}
class wizard extends Hero{
	
}
