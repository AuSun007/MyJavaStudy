package object_study.test1;

import java.util.Random;

public class Pokemon {
    private String name;
    //    private String type;
    private int hp;
    private int ack;
    private int def;
//    private int spa;
//    private int spd;
//    private int spe;

    public Pokemon() {

    }

    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setAck(int ack) {
        this.ack = ack;
    }

    public int getAck() {
        return ack;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getDef() {
        return def;
    }

    public void Attack(Pokemon rival) {
        Random random = new Random();
        int rate = random.nextInt(10);// 命中要害的几率
        int hurt = 0;
        // 计算伤害
        if (rate == 0) {
            hurt = this.ack * 2;
            System.out.println("击中要害");
        } else {
            hurt = this.ack * 2 - rival.getDef() > 0 ? this.ack * 2 - rival.getDef() : 0;
        }
        System.out.println(this.name + " 对 " + rival.getName() + " 造成 " + hurt + " 点伤害！");
        // 判断攻击结果
        rival.setHp(rival.getHp() - hurt);
        if (rival.getHp() <= 0) {
            System.out.println(rival.getName() + " 体力不支倒下！ " + this.name + " 获得胜利！");
        } else {
            System.out.println(rival.getName() + " 的hp还剩下 " + rival.getHp() + " 点！");
        }
    }
}
