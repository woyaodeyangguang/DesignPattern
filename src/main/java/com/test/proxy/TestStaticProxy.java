package com.test.proxy;

/**
 * 客户端通过代理来购票，而代理实际不能够卖票给客户，他实际上是通过目标对象卖票给客户，也就是说他是
 * 通过真实主题的目标对象实现客户端卖票的功能。它只是一个代理中介，可以在它里面增加一些功能，比如身
 * 份认证或者打广告等功能
 *
 * 静态代理类：在程序运行前，代理类的class文件就已经存在了，已确定被代理的对象
 *
 * 静态代理：
 *     优点：对真实对象进行封装，不会修改目标类的代码
 *     缺点：1、多个不同类型的目标对象需要代理时，就需要建立多个代理类，造成类的膨胀
 *           2、代码的冗余
 *           3、编译期加入，不能灵活
 */
public class TestStaticProxy {
  public static void main(String[] args) {
    TicketManager ticketManager = new LogProxy(
        new StaticProxyTicketManager(new TicketManagerImpl()));
    ticketManager.solidTicket();
    ticketManager.changeTicket();
    ticketManager.returnTicket();
  }
}
