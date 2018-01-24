package com.threads.deadlock;

public class ResourceB {

  public synchronized void method(ResourceA a){
    System.out.println("Thread "+ Thread.currentThread().getName() + " acquired lock on B");
    try {
      Thread.sleep(7000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    a.method(this);
  }
}
