package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCreate() {
        Radio radio = new Radio("Molodost",10, 10, 0, 1, 0, 100);

        String expected = "Molodost";

        //assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());

    }

    @Test
    public void shouldSetCurrentStationAboveMax() {
        Radio radio = new Radio("Molodost",9, 9, 0, 1, 0, 100);
        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setCurrentStation(9);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationUnderMin() {
        Radio radio = new Radio("Molodost", 0, 9, 0, 1, 0, 100);
        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

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

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeValidParamReturnEight() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);

        //act
        radio.increaseCurrentVolume();
        //assert
        assertEquals(8,radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeMaxReturnMax() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);

        //act
        radio.increaseCurrentVolume();
        //assert
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeMinReturnOne() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);

        //act
        radio.increaseCurrentVolume();
        //assert
        assertEquals(1,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeValidParamReturnSeven() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(8);

        //act
        radio.decreaseCurrentVolume();
        //assert
        assertEquals(7,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeMinParamReturnMin() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);

        //act
        radio.decreaseCurrentVolume();
        //assert
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeMaxParamReturnNine() {
        //arrange
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);

        //act
        radio.decreaseCurrentVolume();
        //assert
        assertEquals(9,radio.getCurrentVolume());
    }


}