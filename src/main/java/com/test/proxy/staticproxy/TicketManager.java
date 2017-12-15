package com.test.proxy.staticproxy;

/**
 * 生活中的例子；加班比较忙，没空去买火车票，这是可以打电话到票务中心，叫他们帮买回家的火车票，当然
 * 需要附加额外的费用。当然票务中心并没有卖票，只有火车站才真正卖票，票务中心卖的票其实是通过火车站
 * 来实现的，这点很重要。
 *
 * 上面的例子，你就是“客户”，票务中心就是“代理对象”，火车站是“真实对象”，卖票称为“抽象对象”
 * 抽象角色:声明真实对象和代理对象之间的共同接口.
 *
 */
public interface TicketManager {

  /**
   * 售票
   */
  public void solidTicket();

  /**
   * 改签
   */
  public void changeTicket();

  /**
   * 退票
   */
  public void returnTicket();


}
