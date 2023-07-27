package fr.padawan.jenkinsmvc.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RootControllerTest {

    final private RootController rootController = new RootController();
    @Test
    void index() {
        // arrange
        String expected = "inde";
        // act
        String result = rootController.index();
        // assert
        assertEquals(expected, result);
    }
}