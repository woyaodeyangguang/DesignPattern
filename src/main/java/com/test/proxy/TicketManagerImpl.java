package com.test.proxy;

/**
 * 真实主题角色.
 */
public class TicketManagerImpl implements TicketManager{

  @Override
  public void solidTicket() {
    System.out.println("售票");
  }

  @Override
  public void changeTicket() {
    System.out.println("改签");
  }

  @Override
  public void returnTicket() {
    System.out.println("退票");
  }

}
