package jp.ac.uryukyu.ie.e165744;

public class Main {
        public static void main(String[] args){
            Hero hero = new Hero("勇者", 10, 5);
            Enemy enemy = new Enemy("スライム", 6, 3);

            System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

            int turn = 0;
            while( hero.setIsDead() == false && enemy.setIsDead() == false ){
                turn++;
                System.out.printf("%dターン目開始！\n", turn);
                hero.setAttack(enemy);
                enemy.setAttack(hero);
            }
            System.out.println("戦闘終了");
        }
    }
