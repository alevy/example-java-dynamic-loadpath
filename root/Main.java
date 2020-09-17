import java.io.*;
import java.net.*;
import java.lang.reflect.Method;

public class Main {
  public static void main(String[] args) {
    try {
      URL[] urls = { new File("../app").toURI().toURL() };
      URLClassLoader classLoader = new URLClassLoader(urls);
      Class cls = classLoader.loadClass("Workload");
      Object o = cls.getDeclaredConstructor().newInstance();
      Method app = cls.getDeclaredMethod("handle");
      app.setAccessible(true);
      app.invoke(o);
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}
