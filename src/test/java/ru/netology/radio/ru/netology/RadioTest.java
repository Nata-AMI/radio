package ru.netology.radio.ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void next() {
        Radio radio = new Radio();
        radio.setStation(7);
        radio.next();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void prev() {
        Radio radio = new Radio();
        radio.setStation(7);
        radio.prev();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(7);
        radio.decreaseVolume();
        assertEquals(6, radio.getVolume());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getVolume());
    }
}



