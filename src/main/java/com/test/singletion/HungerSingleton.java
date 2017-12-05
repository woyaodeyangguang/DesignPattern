package com.test.singletion;

/**
 * 饿汉模式.
 * 问题: 如果只是加载本类,而是没有调用getInstance方法会造成资源浪费
 */
public class HungerSingleton {

  /**
   * 类初始化时加载该实例
   * 类加载时，天然的线程安全时刻
   */
  private static final HungerSingleton instance = new HungerSingleton();

  private HungerSingleton() {}

  /**
   * 方法没有同步synchronized, 效率高
   * @return
   */
  public static HungerSingleton getInstance() {
    return instance;
  }
}
