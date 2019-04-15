package com.example.sfgtdd.sfgjunit5intro.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void helloWorld() {
        Greeting greeting = new Greeting();
        assertEquals("Hello World", greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        Greeting greeting = new Greeting();
        assertEquals("Hello John", greeting.helloWorld("John"));
    }
}