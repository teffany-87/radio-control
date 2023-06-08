package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentStation0() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolume0() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolume11() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentStation(0);
        radio.NextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation1() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentStation(1);
        radio.NextStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation8() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentStation(8);
        radio.NextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation9() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentStation(9);
        radio.NextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentStation(0);
        radio.PrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation1() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentStation(1);
        radio.PrevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation9() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentStation(9);
        radio.PrevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation8() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentStation(8);
        radio.PrevStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentVolume(8);

        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume9() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentVolume(9);
        radio.IncreaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume10() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentVolume(10);
        radio.IncreaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentVolume(0);
        radio.IncreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume1() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentVolume(1);
        radio.IncreaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume1() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentVolume(1);
        radio.ReduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentVolume(0);
        radio.ReduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume10() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentVolume(10);
        radio.ReduceVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume9() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();

        radio.setCurrentVolume(9);
        radio.ReduceVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}