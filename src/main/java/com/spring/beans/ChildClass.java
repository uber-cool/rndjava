package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChildClass extends ParentClass{
    @Autowired
    FamilyName familyName;
}
