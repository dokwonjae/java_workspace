package ch03_1;

public class Wizard extends Hero {

   public Wizard(String name, int hp) {
      super(name, hp);
   }

   public void freeZing() {
      System.out.println("얼음 공격을 합니다.");
   }

   @Override
   protected void attack() {
      System.out.println(super.name + " 이 기본 공격을 합니다.");
   }

} // end of class