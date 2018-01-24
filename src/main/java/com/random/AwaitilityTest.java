package com.random;


import java.util.Date;
import java.util.concurrent.Callable;
import org.awaitility.Awaitility;

import static java.util.concurrent.TimeUnit.SECONDS;

public class AwaitilityTest {

  public static void main(String[] args) {
    System.out.println(new Date()+" - "+Thread.currentThread().getName());
    try {
      Awaitility.await().atMost(10, SECONDS).pollDelay(5, SECONDS).pollInterval(1, SECONDS)
          .until(new DoSomething());
    }
    catch (Exception e){
      System.out.println(e.getMessage());
    }
    System.out.println("Time is: " + new Date());
  }

}

class DoSomething implements Callable<Boolean>{
  public Boolean call(){
    System.out.println(new Date() +" - " +Thread.currentThread().getName()+" - Cheking the status...");
    return new Boolean("false");
  }
}
