package com.test.proxy.staticproxy;

/**
 * 真实主题角色.
 */
public class TicketManagerImpl implements TicketManager{

  public void solidTicket() {
    System.out.println("售票");
  }

  public void changeTicket() {
    System.out.println("改签");
  }

  public void returnTicket() {
    System.out.println("退票");
  }

}
