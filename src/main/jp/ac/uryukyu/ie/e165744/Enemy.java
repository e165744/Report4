package jp.ac.uryukyu.ie.e165744;

public class Enemy extends LivingThing{

    public Enemy (String name, int maximumHP, int attack) {
        super(name ,maximumHP ,attack);
    }
    @Override
    public void wounded(int damage){
        setHitPoint -= damage;
        if( setHitPoint < 0 ) {
            setIsDead(true);
            System.out.printf("モンスター%sは倒れた。\n", setName);
        }
    }
}