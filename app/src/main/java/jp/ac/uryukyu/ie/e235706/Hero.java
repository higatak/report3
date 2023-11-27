package jp.ac.uryukyu.ie.e235706;

public class Hero extends LivingThing {
    

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String _name, int _maximumHP, int _attack) {
        super(_name, _maximumHP,_attack );
    }

    @Override
    public void wounded(int damage){
        int nowHp = getHitPoint() - damage;
        setHitPoint(nowHp);
        if(nowHp < 0){
            setDead(true);
            System.out.printf("勇者は%sは道半ばで力尽きてしまった。\n", getName());

        }
    }
}    