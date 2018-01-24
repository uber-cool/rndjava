package com.random;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsJava {

  public static void main(String[] args) {

    List<Staff> staff = Arrays.asList(
        new Staff("mkyong", 30, new BigDecimal(10000)),
        new Staff("jack", 27, new BigDecimal(20000)),
        new Staff("lawrence", 33, new BigDecimal(30000))
    );

    //Java 8
    List<String> collect = staff.stream().map(Staff::getName).collect(Collectors.toList());
    System.out.println(collect); //[mkyong, jack, lawrence]

  }
}

class Staff {

  private String name;
  private int age;
  private BigDecimal salary;

  public Staff(String name, int age, BigDecimal salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
  public String getName() {
    return name;
  }
}