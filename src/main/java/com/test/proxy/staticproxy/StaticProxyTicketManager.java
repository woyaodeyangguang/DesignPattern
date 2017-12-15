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

  @Override
  public void solidTicket() {
    checkIdentity();
    ticketManager.solidTicket();
  }

  @Override
  public void changeTicket() {
    checkIdentity();
    ticketManager.changeTicket();
  }

  @Override
  public void returnTicket() {
    checkIdentity();
    ticketManager.returnTicket();
  }

  public void checkIdentity() {
    System.out.println("身份验证-----------");
  }

}
