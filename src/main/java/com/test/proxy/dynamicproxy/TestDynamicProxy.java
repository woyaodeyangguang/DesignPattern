package com.test.proxy.dynamicproxy;

import com.test.proxy.staticproxy.TicketManager;
import com.test.proxy.staticproxy.TicketManagerImpl;

/**
 * 动态代理优点：
 * 1、一个动态代理类更加简单、可以解决创建多个静态代理的麻烦，避免重复代码
 * 2、调用目标代码时，会在方法"运行时"动态的加入
 * 动态代理的缺点：
 * 1、比静态代理效率低
 * 2、动态代理比静态代理可读性上差一点
 * 3、JDK动态代理只能对实现了接口的类进行代理
 */
public class TestDynamicProxy {
  public static void main(String[] args) {
    DynamicProxyTicketManager dynamicProxyTicketManager = new DynamicProxyTicketManager();
    TicketManager ticketManager =
        (TicketManager) dynamicProxyTicketManager.newProxyInstance(new TicketManagerImpl());
    ticketManager.solidTicket();
    ticketManager.changeTicket();
    ticketManager.returnTicket();
  }
}
