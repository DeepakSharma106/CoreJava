package com.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    @DisplayName("this is testing")
    public void checking1(){
        Assertions.assertEquals(1,1);
    }

    @Test
    public void checking2(){
        Assertions.assertEquals(1,1);
    }




}
