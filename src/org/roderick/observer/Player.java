package org.roderick.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 玩家
 */
public class Player implements Observable {
    private String name = "张三";
    private Task task = null;
    private LaoWang monster = null;
    private List<Observer> observerList = new LinkedList<Observer>();


    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : this.observerList) {
            observer.update(this, this.task);
        }
    }

    public void receiveTask() {
        //创建并初始化任务对象
        this.task = new Task();
        this.task.setName("危险：隔壁家老王"); //任务名称
        this.task.setDescription("消灭隔壁家老王"); //这个任务具体要做的事情
        this.task.setTotal(1); //要揍几只怪物

        System.out.println(getName() + "接受任务：" + this.task.getName());
        System.out.println("任务需求：" + this.task.getProgress());
    }

    /**
     * 找啊找啊找怪物
     */
    public void searchMonsters() {
        //创建并初始化怪物对象
        this.monster = new LaoWang();
        monster.setName("隔壁家老王");
        monster.setBlood(3);

        System.out.println(this.name + "找到了" + monster.getName() + "，开始揍它！");
    }

    public void attack() {
        while (!this.monster.isEliminate()) {
            int randomAttack = (int) (Math.random() * 2) + 1; //生成1至3的随机数，玩家只有1-3的攻击力，但是怪物也很弱啊，它只有3点血
            this.monster.beAttacked(randomAttack);
        }

        System.out.println(this.monster.getName() + "被" + name + "揍扁了。");
        //怪物揍完了，通知观察者
        notifyObserver();
    }

    public String getName() {
        return name;
    }

}
