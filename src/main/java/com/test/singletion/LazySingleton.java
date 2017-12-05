package com.test.singletion;

/**
 * 懒汉模式.
 */
public class LazySingleton {

  /**
   * 类加载时并没有初始化,延迟加载
   */
  private  static LazySingleton instance;

  private LazySingleton() {}

  /**
   * 注意线程安全
   * @return
   */
  public static synchronized LazySingleton getInstance() {
    if(instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }

}
