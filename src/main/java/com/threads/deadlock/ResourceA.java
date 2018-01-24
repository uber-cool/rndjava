package com.threads.deadlock;

public class ResourceA {
  public synchronized void method(ResourceB b){
    System.out.println("Thread "+ Thread.currentThread().getName() + " acquired lock on A");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    b.method(this);
  }
}
