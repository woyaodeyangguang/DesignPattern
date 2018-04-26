package com.test.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理.
 */
public class DynamicProxyTicketManager implements InvocationHandler{

  private Object targetObject;

  /**
   * 目标的初始化方法，根据目标生成代理类
   * @return
   */
  public Object newProxyInstance(Object targetObject) {
    this.targetObject = targetObject;
    // 第一个参数 目标对象的类加载器
    // 第二个参数 目标接口已实现的所有接口，而这些都是动态代理类要实现的接口了列表
    // 第三个参数 调用实现了InvocationHandler的对象生成动态代理对象
    return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
        targetObject.getClass().getInterfaces(), this);
  }

  /**
   * 反射，这样可以在不知道具体类的情况下，根据配置的参数去调用一个方法，灵活编程
   * @param proxy
   * @param method
   * @param args
   * @return
   * @throws Throwable
   */
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    // 检查
    checkIdentity();
    Object result = null;
    try{
      // 调用目标方法
      method.invoke(targetObject, args);
      // 执行成功,打印成功信息
      log();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("error---->" + method.getName());
    }
    return result;
  }

  /**
   * 身份验证
   */
  public void checkIdentity() {
    System.out.println("身份验证-----------");
  }

  public void log() {
    System.out.println("日志......");
  }


}
