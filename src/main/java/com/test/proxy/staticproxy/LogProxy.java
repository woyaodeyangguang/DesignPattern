package com.test.proxy.staticproxy;

/**
 * 第二个代理主题角色.
 */
public class LogProxy implements TicketManager{
  private TicketManager ticketManager;

  public LogProxy(TicketManager ticketManager) {
    this.ticketManager = ticketManager;
  }

  public void solidTicket() {
    ticketManager.solidTicket();
    // 后置增强
    log();
  }

  public void changeTicket() {
    ticketManager.changeTicket();
    // 后置增强
    log();
  }

  public void returnTicket() {
    ticketManager.returnTicket();
    // 后置增强
    log();
  }

  // 增强
  public void log() {
    System.out.println("静态代理日志");
  }
}
