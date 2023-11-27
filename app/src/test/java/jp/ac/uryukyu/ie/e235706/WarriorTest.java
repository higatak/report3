package jp.ac.uryukyu.ie.e235706;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        int attack = 100 ;
        Warrior demoWarrior =new Warrior("デモ戦士", 100, attack);
        Enemy slime1 = new Enemy("スライムもどき１",150, 30);
        Enemy slime2 = new Enemy("スライムもどき２",150, 30);
        Enemy slime3 = new Enemy("スライムもどき３", 150,30);
    

        ArrayList<Enemy> slimes = new ArrayList<>();
        slimes.add(slime1);
        slimes.add(slime2);
        slimes.add(slime3);

        for (Object s : slimes){
            Enemy slime = (Enemy)s;
            demoWarrior.attackWithWeponSkill(slime);
            int nowSlimeHp = slime.getHitPoint();

            assertEquals(nowSlimeHp,0);
        }
    }  
}
