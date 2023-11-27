package jp.ac.uryukyu.ie.e235706;

public class LivingThing {
    private String name;
    private int hitpoint;
    private int attack;
    private boolean dead;

    public LivingThing(String _name, int _maximumHP, int _attack){
        this.name = _name;
        this.hitpoint = _maximumHP;
        this.attack = _attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n",name, hitpoint, attack);
    }

    public String getName(){
        return this.name;
    }
    
    public boolean isDead(){
        return this.dead;
    }

    public void wounded(int damage){
        hitpoint -= damage;
        if(hitpoint < 0){
            dead = true;
            System.out.printf("%sは倒れた。\n",name);
        }
    }

    public void attack(LivingThing opponent){
        if(dead == false){
            int damage = (int)(Math.random()*attack);
            System.out.printf("%sの攻撃!%sに%dのダメージを与えた!!\n",name, opponent.name, damage);
            opponent.wounded(damage);
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHitPoint(){
        return this.hitpoint;
    }

    public int getAttack(){
        return this.attack;
    }

    public void setHitPoint(int hitpoint){
        this.hitpoint = hitpoint;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }

}
    

