package com.test.singletion;

/**
 * 静态内部类实现单例.
 */
public class StaticInnerSingleton {

  private static class LazyHolder {
    private static final LazyHolder instance = new LazyHolder();

    private LazyHolder() {}
  }

  /**
   * 只有真正调用getInstance方法时,才会加载静态内部类(延迟加载)
   * @return
   */
  public static LazyHolder getInstance() {
    return LazyHolder.instance;
  }
}
