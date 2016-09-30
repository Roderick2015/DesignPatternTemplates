package org.roderick.observer;

/**
 *  怪物
 */
public class Monster {
    private int blood; //怪物的默认血量值
    private String name;

    /**
     *  被扇了一巴掌
     */
    public void beAttacked(int damage) {
        this.blood = damage > this.blood ? 0 : (this.blood - damage);
        System.out.println("怪物失去" + damage + "点生命值，剩余血量" + this.blood);
    }

    /**
     *  血量值为0时，怪物就被玩家干掉了
     */
    public boolean isEliminate() {
        return this.blood < 0 ? true : this.blood == 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
}
