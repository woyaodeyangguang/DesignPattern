package com.test.singletion;

/**
 * 静态内部类实现单例.
 */
public class StaticInnerSingleton {

  private static class LazyHolder {
    private static final StaticInnerSingleton instance = new StaticInnerSingleton();

    private LazyHolder() {}
  }

  /**
   * 只有真正调用getInstance方法时,才会加载静态内部类(延迟加载)
   * @return
   */
  public static StaticInnerSingleton getInstance() {
    return LazyHolder.instance;
  }
}
