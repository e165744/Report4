package jp.ac.uryukyu.ie.e165744;
import org.junit.Test;

import static org.junit.Assert.*;
public class EnemyTest {
    @Test
    public void getAttack() throws Exception {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setDead = true;
        for (int i = 0; i < 10; i++) {
            enemy.setAttack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.setHitPoint);
    }
}