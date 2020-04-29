package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerAdvancedTest {

    @Test
    public void shouldCreate() {
        Conditioner conditioner = new Conditioner();

        String expected = "huebosh";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());

    }

    @Test
    public void shouldSetterLogic() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldIncreaseCurrentTemperatureUnderMinReturnZero() {
        //arrange
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(11);
        //act
        conditioner.increaseCurrentTemperature();
        //assert
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureValidParamReturnValidParam() {
        //arrange
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(21);
        //act
        conditioner.increaseCurrentTemperature();
        //assert
        assertEquals(22, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureAboveMaxReturnZero() {
        //arrange
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(26);
        //act
        conditioner.increaseCurrentTemperature();
        //assert
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureValidParamReturnValidParam() {
        //arrange
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(21);
        //act
        conditioner.decreaseCurrentTemperature();
        //assert
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureUnderMinReturnZero() {
        //arrange
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(11);
        //act
        conditioner.decreaseCurrentTemperature();
        //assert
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureAboveMaxReturnZero() {
        //arrange
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(27);
        //act
        conditioner.decreaseCurrentTemperature();
        //assert
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureMaxReturnMax() {
        //arrange
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(25);
        //act
        conditioner.increaseCurrentTemperature();
        //assert
        assertEquals(25, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureLittleAboveMaxReturnZero() {
        //arrange
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(26);
        //act
        conditioner.decreaseCurrentTemperature();
        //assert
        assertEquals(0, conditioner.getCurrentTemperature());
    }
}