package com.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FamilyName {
    @Value("Jangid")
    private String familyName;
}
