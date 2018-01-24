package com.threads.t;

public class MyThread extends Thread {
  public MyThread(){
    System.out.println("Hello");
  }
  public void run(){
    System.out.println("run");
  }

}
