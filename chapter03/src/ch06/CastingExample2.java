package ch06;

public class CastingExample2 {

	public static void main(String[] args) {
		
		// 배열을 활용
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Animal();
		animals[2] = new Animal();
		
		System.out.println("====================");
		// 0 -- Animal
		// 1 -- Bird -> if --> true
		// 2 -- Animal --> if -- false
		for (Animal a : animals) {
			a.makeSound();
			// a.fly(); 데이터 타입을 확인하고 싶다면 instance of 연산자
			if(a instanceof Bird) {
				Bird targetbird = (Bird)a;
				targetbird.fly();
			}
			System.out.println("---------------------");
		}
	} // end of main

} // end of class
