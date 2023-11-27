package jp.ac.uryukyu.ie.e235706;

public class Enemy extends LivingThing {
    
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String _name, int _maximumHP, int _attack) {
        super(_name, _maximumHP, _attack);
    }

}   