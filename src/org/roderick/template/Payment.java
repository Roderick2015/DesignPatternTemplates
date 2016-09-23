package org.roderick.template;

/**
 * 负责工资支付相关操作定义
 */
public interface Payment {

    void setMoney(double money);

    void isPay(boolean payFlag); //是否打算支付工资

}
