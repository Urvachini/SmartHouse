package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerAdvancedTest {


    @Test
    public void shouldCreate() {
        Conditioner conditioner = new Conditioner(13, "huebosh",
                45, 0, 25, true);

        String expected = "huebosh";

        //  assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());

    }

    @Test
    public void shouldSetterLogic() {

        Conditioner conditioner = new Conditioner();

        //  conditioner.setMaxTemperature(25);
        //  conditioner.setMinTemperature(12);

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldIncreaseCurrentTemperatureUnderMinReturnZero() {
        Conditioner conditioner = new Conditioner();
        //arrange

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
        Conditioner conditioner = new Conditioner();
        //arrange

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
        Conditioner conditioner = new Conditioner();
        //arrange

        //conditioner.setMaxTemperature(25);
        //conditioner.setMinTemperature(12);
        //conditioner.setCurrentTemperature(26);
        //act
        conditioner.increaseCurrentTemperature();
        //assert
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureValidParamReturnValidParam() {
        Conditioner conditioner = new Conditioner();
        //arrange


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
        Conditioner conditioner = new Conditioner();
        //arrange

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
        Conditioner conditioner = new Conditioner();
        //arrange

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
        Conditioner conditioner = new Conditioner();
        //arrange

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
        Conditioner conditioner = new Conditioner();
        //arrange

        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(26);
        //act
        conditioner.decreaseCurrentTemperature();
        //assert
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void test() {
        Conditioner conditioner = new Conditioner();


        assertEquals("Subzero", conditioner.getName());
        assertEquals(0, conditioner.getId());
        assertEquals(32, conditioner.getMaxTemperature());
        assertEquals(10, conditioner.getMinTemperature());
        assertEquals(22, conditioner.getCurrentTemperature());
        assertFalse(conditioner.isOn());



        System.out.println("Hi!");
    }
}