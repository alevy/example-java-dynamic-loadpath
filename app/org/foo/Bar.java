package org.foo;

import com.thedeanda.lorem.LoremIpsum;

public class Bar {
  public static void baz() {
    LoremIpsum ipsum = new LoremIpsum();
    System.out.println(ipsum.getWords(6,12));
  }
}
