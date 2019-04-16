package com.example.sfgtdd.sfgjunit5intro.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        assertEquals("Hello World", greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        assertEquals("Hello John", greeting.helloWorld("John"));
    }
}