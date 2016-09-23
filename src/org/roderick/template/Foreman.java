package org.roderick.template;

/**
 * 包工头
 */
public class Foreman {
    public static void main(String[] args) {
        Himma a = new HimmaA();
        a.setMoney(236.3);
        a.moveBricks("南边广场的砖");

        System.out.println("-----------分割线-----------");

        Himma b = new HimmaB();
        b.setMoney(356.2);
        b.isPay(false); //虽然讲好了价钱，但是包工头今天手头有点紧，准备拖欠工资
        b.moveBricks("北边宿舍的一大堆砖");
    }
}
