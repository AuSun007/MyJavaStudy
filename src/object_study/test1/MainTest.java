package object_study.test1;

import java.util.Random;

public class MainTest {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon();

        p1.setName("固拉多");
        p1.setHp(100);
        p1.setAck(30);
        p1.setDef(20);

        p2.setName("盖欧卡");
        p2.setHp(100);
        p2.setAck(20);
        p2.setDef(30);

        while(p1.getHp() > 0 && p2.getHp() > 0){
            Random r = new Random();
            int turn = r.nextInt(2);
            if (turn == 0){
                System.out.println("\n" + p1.getName() + " 的回合！");
                p1.Attack(p2);
            } else {
                System.out.println("\n" + p2.getName() + " 的回合！");
                p2.Attack(p1);
            }
        }

    }
}
