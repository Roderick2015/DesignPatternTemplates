package org.roderick.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 玩家
 */
public class ZhangSan implements Player {
    private String name = "张三";
    private TaskInfo task = null;
    private LaoWang monster = null;
    //添加的观察者列表
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
        //逐个通知所有的观察者，实际应用中可按需通知
        for (Observer observer : this.observerList) {
            observer.update(this, this.task);
        }
    }

    public void receiveTask() {
        this.task = new TaskInfo(); //创建并初始化任务对象
        this.task.setName("危险：隔壁家老王"); //任务名称
        this.task.setDescription("消灭隔壁家老王"); //这个任务具体要做的事情
        this.task.setMonsterName("隔壁家老王"); //任一共要揍几只怪物务怪名称
        this.task.setTotal(1); //

        System.out.println(getName() + "接受任务 " + this.task.getName());
        System.out.println("任务进度：" + this.task.getProgress());
    }

    /**
     * 找啊找啊找怪物
     */
    public void findMonsters() {
        //创建并初始化怪物对象
        this.monster = new LaoWang();
        monster.setName(this.task.getMonsterName());
        monster.setBlood(3);

        System.out.println(this.name + "找到了" + this.monster.getName() + "，开始揍它！");
    }

    /**
     * 攻击怪物
     */
    public void attack() {
        while (!this.monster.isEliminate()) {
            //生成1至3的随机数，玩家只有1-3的攻击力，但是怪物也很弱啊。
            int randomAttack = (int) (Math.random() * 2) + 1;
            this.monster.beAttacked(randomAttack);
        }

        System.out.println(this.monster.getName() + "被" + name + "揍扁了。");
        //怪物揍完了，通知观察者
        notifyObserver();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
