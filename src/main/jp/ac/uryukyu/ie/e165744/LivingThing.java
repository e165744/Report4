package jp.ac.uryukyu.ie.e165744;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.attack = attack;
        this.hitPoint = hitPoint;
    }

    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    public void attack(LivingThing opponent) {
        int damage = (int) (Math.random() * attack);
        if (hitPoint>=0) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        }
        else{
        }
        opponent.wounded(damage);
    }
    public void wounded(int damage) {
        hitPoint -= damage;
    }
}
