// 20230808_상속 #4
package ch03_1;

public class MainTest1 {

   public static void main(String[] args) {

      Warrior warrior1 = new Warrior("전사1", 100);
      Wizard wizard1 = new Wizard("마법사1", 80);
      Archer archer1 = new Archer("궁수1", 100);
      // 오버라이드 메서드
      // 1. 자기 자신에 메서드를 확인 (자식 - warrior)
      // 2. 자기 자신에 attack() 메서드가 없다면 부모 객체를 확인한다.
      warrior1.attack();
      wizard1.attack();
      archer1.fireArrow();

   } // end of main

} // end of class