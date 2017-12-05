package com.test.singletion;

/**
 * 双重锁检查
 */
public class DoubleCheckSingleton {

  // volatile保证所有的写(write)都将先行发生读(read)
  private static volatile DoubleCheckSingleton instance;

  private DoubleCheckSingleton() {
    String threadName = Thread.currentThread().getName();
    System.out.println(threadName + " invoke DoubleCheckSingleton construct.");
  }

  public static DoubleCheckSingleton getInstance() {
    if(instance == null) {
      synchronized (DoubleCheckSingleton.class) {
        if(instance == null) {
          instance = new DoubleCheckSingleton();
        }
      }
    }
    return instance;
  }

  public static synchronized DoubleCheckSingleton getInstanceBad() {
    if(instance == null) {
      instance = new DoubleCheckSingleton();
    }
    return instance;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 20; i++) {
      Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
          DoubleCheckSingleton.getInstance();
        }
      }, "thread - " + i);
      thread.start();
    }
  }


}
