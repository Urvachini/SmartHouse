package ru.netology.domain;

public class Conditioner {
    private int id;

    private String name = "Subzero";
    private int maxTemperature = 32;
    private int minTemperature = 10;
    private int currentTemperature = 22;
    private boolean on;

    public Conditioner(int id, String name, int maxTemperature, int minTemperature, int currentTemperature, boolean on) {
        this.id = id;
        this.name = name;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.currentTemperature = currentTemperature;
        this.on = on;
    }

    public Conditioner() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentTemperature() {
        int nextTemperature = currentTemperature + 1;

        if (nextTemperature > maxTemperature) {
            return;
        }
        if (nextTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = nextTemperature;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }

        currentTemperature = currentTemperature - 1;
    }
}
