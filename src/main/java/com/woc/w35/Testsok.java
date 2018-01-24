package com.woc.w35;

public class Testsok {

  public static void main(String[] args) {

    String one = "Request Method: DELETE";
        String two = "Request URL: http://10.101.57.42:8004/v1/eca4dc2b8a7a4655aa73be109cec6406/stacks/IPFE_9149546160551524504/6087cba6-1002-4f23-9912-b350ccca6485";
        String three = "Request headers: {X-Auth-Token=80f56aa5752f425b92351fa6734828d8, User-Agent=OpenStack4j / OpenStack Client}";
        String four = "Request body: nirav".trim();

    System.out.println(one.split(" ")[0]);
    System.out.println(one.split(" ")[1].replace(":", ""));
    System.out.println(one.substring(one.indexOf(":") + 2));

    System.out.println(two.split(" ")[0]);
    System.out.println(two.split(" ")[1].replace(":", ""));
    System.out.println(two.substring(two.indexOf(":") + 2));

    System.out.println(three.split(" ")[0]);
    System.out.println(three.split(" ")[1].replace(":", ""));
    System.out.println(three.substring(three.indexOf(":") + 2));

    System.out.println(four.split(" ")[0]);
    System.out.println(four.split(" ")[1].replace(":", ""));
    System.out.println(four.length() );
    System.out.println(four.indexOf(":"));
    if (four.length() > four.indexOf(":") + 1)
      System.out.println("*" + four.substring(four.indexOf(":") + 2) + "*");
    else {
      System.out.println("Empty");
    }


  }
}
