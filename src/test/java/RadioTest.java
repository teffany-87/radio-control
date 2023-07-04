package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radio = new Radio();

    Radio radio45 = new Radio(45);

    @Test
    public void shouldSetCurrentStation10() {

        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation45() {

        radio45.setCurrentStation(45);
        assertEquals(0, radio45.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation44() {

        radio45.setCurrentStation(44);
        assertEquals(44, radio45.getCurrentStation());
    }


    @Test
    public void shouldSetCurrentStation() {

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentVolume() {

        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume1() {

        radio.setCurrentVolume(1);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume100() {

        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void shouldNextStation1() {

        radio.setCurrentStation(0);
        radio.nextStation();

        assertEquals(1, radio.getCurrentStation());
    }


    @Test
    public void shouldNextStation9() {

        radio.setCurrentStation(8);
        radio.nextStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation44() {

        radio45.setCurrentStation(43);
        radio45.nextStation();

        assertEquals(44, radio45.getCurrentStation());
    }

    @Test
    public void shouldNextStation0() {

        radio45.setCurrentStation(44);
        radio45.nextStation();

        assertEquals(0, radio45.getCurrentStation());
    }


    @Test
    public void shouldNextStation10() {

        radio.setCurrentStation(9);
        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation9() {

        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation44() {

        radio45.setCurrentStation(0);
        radio45.prevStation();

        assertEquals(44, radio45.getCurrentStation());
    }


    @Test
    public void shouldPrevStation0() {

        radio.setCurrentStation(1);
        radio.prevStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation8() {

        radio.setCurrentStation(9);
        radio.prevStation();

        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation43() {

        radio45.setCurrentStation(44);
        radio45.prevStation();

        assertEquals(43, radio45.getCurrentStation());
    }

    @Test
    public void shouldCurrentVolume() {

        radio.setCurrentVolume(99);
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolume101() {

        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseVolume100() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseVolume() {

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }


    @Test
    public void shouldReduceVolume1() {

        radio.setCurrentVolume(1);
        radio.reduceVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume() {

        radio.setCurrentVolume(0);
        radio.reduceVolume();

        assertEquals(0, radio.getCurrentVolume());
    }


}