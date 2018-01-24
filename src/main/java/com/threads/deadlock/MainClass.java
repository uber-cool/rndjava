package com.threads.deadlock;

public class MainClass {

  public static void main(String[] args) {
    ResourceA a = new ResourceA();
    ResourceB b = new ResourceB();

    Thread t1 = new Thread(new ThreadA(a, b));
    Thread t2 = new Thread(new ThreadB(a, b));

    t1.start();
    t2.start();


    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
