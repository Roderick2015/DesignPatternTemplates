package org.roderick.observer;

/**
 * 任务实体类
 */
public class Task {
    private String name; //任务名称
    private String description; //任务描述
    private int current = 0; //已kill的怪物数量，这里给个默认值
    private int total; //需要kill的怪物数量（用于监听任务的进度）

    /**
     * 每次调用该方法，当前kill的怪物数量+1
     * （本例中，玩家一次只能kill一只怪）
     */
    public void increment() {
        current++;
        System.out.println("当前任务进度：" + getProgress());
    }

    /**
     * 是否已完成任务，即已杀怪数与需要数相等
     */
    public boolean isComplete() {
        return current == total;
    }

    /**
     * 查询任务进度
     */
    public String getProgress() {
        return current + "/" + total + description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = " " + description;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
