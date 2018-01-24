package com.threads.deadlock;

public class ThreadA implements Runnable {
  public ResourceA resA;
  public ResourceB resB;
  public ThreadA(ResourceA a, ResourceB b){
    resA = a;
    resB = b;
  }
  @Override
  public void run(){
    resA.method(resB);
  }
}
