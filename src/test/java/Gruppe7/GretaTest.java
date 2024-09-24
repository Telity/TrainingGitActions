package Gruppe7;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class GretaTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void printName() {
        // Arragne, act, assert
        Greta greta = new Greta();
        String name = "Greta";
        String expected = "hello" + name;
        String actual = greta.printName(name);
        assertEquals(expected, actual);
    }

}