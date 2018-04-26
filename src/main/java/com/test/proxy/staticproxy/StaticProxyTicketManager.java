package com.test.proxy.staticproxy;

/**
 * 代理主题角色(增加了身份验证功能).
 */
public class StaticProxyTicketManager implements  TicketManager{

  // 目标对象的引用
  private TicketManager ticketManager;

  public StaticProxyTicketManager(TicketManager ticketManager) {
    this.ticketManager = ticketManager;
  }

  public void solidTicket() {
    checkIdentity();
    ticketManager.solidTicket();
  }

  public void changeTicket() {
    checkIdentity();
    ticketManager.changeTicket();
  }

  public void returnTicket() {
    checkIdentity();
    ticketManager.returnTicket();
  }

  public void checkIdentity() {
    System.out.println("静态代理身份验证-----------");
  }

}
