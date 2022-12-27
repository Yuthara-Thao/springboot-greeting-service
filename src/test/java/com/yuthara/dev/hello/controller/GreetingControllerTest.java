package com.yuthara.dev.hello.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GreetingControllerTest {

    @Autowired
    private GreetingController greetingController;

    @Test
    void testGreeting() {
        Assertions.assertThat(greetingController.greeting()).isEqualTo("Hello, world! Greeting from Azure");
    }
}
