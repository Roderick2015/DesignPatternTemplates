package org.roderick.observer;

/**
 * 玩家
 */
public class Player {
    private boolean notify = false;
    private String name = "张三";
    private Monster monster = null;

    /**
     * 找啊找啊找怪物
     */
    public void searchMonsters(Monster monster) {
        System.out.println(this.name + "找到了" + monster.getName() + "，要开始揍它了！");
        this.monster = monster;
    }

    public void attack() {
        while (!this.monster.isEliminate()) {
            int randomAttack = (int) (Math.random() * 2) + 1; //生成1至3的随机数，玩家只有1-3的攻击力，但是怪物也很弱啊，它只有3点血
            this.monster.beAttacked(randomAttack);
        }

        System.out.println(this.monster.getName() + "被" + name + "揍扁了。");
        this.notify = true;
    }

    public String getName() {
        return name;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }

    public boolean isNotify() {
        return this.notify;
    }
}
