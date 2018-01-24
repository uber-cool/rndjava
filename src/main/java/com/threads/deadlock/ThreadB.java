package com.threads.deadlock;

public class ThreadB implements Runnable {
  public ResourceA resA;
  public ResourceB resB;
  public ThreadB(ResourceA a, ResourceB b){
    resA = a;
    resB = b;
  }
  @Override
  public void run(){
    resB.method(resA);
  }
}
