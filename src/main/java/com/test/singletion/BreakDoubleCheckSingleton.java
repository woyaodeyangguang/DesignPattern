package com.test.singletion;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.Test;

/**
 * 利用反射破解DoubleCheck.
 */
public class BreakDoubleCheckSingleton {

  @Test
  public void testBreakDoubleCheck()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
      InstantiationException {
    Class<DoubleCheckSingleton> clazz = DoubleCheckSingleton.class;
    Constructor<DoubleCheckSingleton> constructor = clazz.getDeclaredConstructor();
    constructor.setAccessible(true);
    DoubleCheckSingleton instance1 = constructor.newInstance();
    DoubleCheckSingleton instance2 = constructor.newInstance();
    System.out.println(instance1 == instance2);
  }

}
