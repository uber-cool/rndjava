package com.serializable;

import java.io.Serializable;

public class Person implements Serializable {
    private final Add address = new Address();


}
interface Add extends Serializable{

}
class Address implements Add{
  String street;
}
