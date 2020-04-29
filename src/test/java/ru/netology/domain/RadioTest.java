package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationValidParamReturnEight() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(7);

        //act
        radio.increaseCurrentStation();
        //assert
        assertEquals(8,radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationAboveMaxReturnZero() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);

        //act
        radio.increaseCurrentStation();
        //assert
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationMediumReturnSix() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);

        //act
        radio.increaseCurrentStation();
        //assert
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationMinReturnOne() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);

        //act
        radio.increaseCurrentStation();
        //assert
        assertEquals(1,radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationMinReturnNine() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);

        //act
        radio.decreaseCurrentStation();
        //assert
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationMediumReturnFour() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);

        //act
        radio.decreaseCurrentStation();
        //assert
        assertEquals(4,radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationMaxReturnEight() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);

        //act
        radio.decreaseCurrentStation();
        //assert
        assertEquals(8,radio.getCurrentStation());
    }

}