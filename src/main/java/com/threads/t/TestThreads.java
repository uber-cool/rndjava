package com.threads.t;

public class TestThreads {

  public static void main(String[] args) {
    Thread t = new MyThread(){
      public void run() {
        System.out.println("overidden");
      }
    };
    t.start();
    long a [] = {2, 1};
    long b [] = fix(a);

    System.out.println(a[1]);
    System.out.println(b[1]);
  }
  public static long [] fix(long [] a){
    a[1] = 5;
    return a;
  }
}
