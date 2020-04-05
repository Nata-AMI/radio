package ru.netology.radio.ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test
    void next() {
        Radio radio = new Radio();
        radio.setStation(7);
        radio.next();
        assertEquals(8, radio.getCurrentStation());
    }
}



