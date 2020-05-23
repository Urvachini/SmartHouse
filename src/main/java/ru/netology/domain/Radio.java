package ru.netology.domain;

public class Radio {
    private String name;
    private int currentStation = 9;
    private int maxStation = 9;
    private int minStation = 0;

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(String name, int currentStation, int maxStation, int minStation, int currentVolume, int minVolume, int maxVolume) {
        this.name = name;
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public Radio() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseCurrentStation() {
        int nextStation = currentStation + 1;

        if (nextStation > maxStation) {
            nextStation = minStation;
        }
        this.currentStation = nextStation;
    }

    public void decreaseCurrentStation() {
        int prevStation = currentStation - 1;

        if (prevStation < minStation) {
            prevStation = maxStation;
        }
        this.currentStation = prevStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        int nextVolume = currentVolume + 1;

        if (nextVolume > maxVolume) {
            nextVolume = maxVolume;
        }
        this.currentVolume = nextVolume;
    }

    public void decreaseCurrentVolume() {
        int prevVolume = currentVolume - 1;

        if (prevVolume < minVolume) {
            prevVolume = minVolume;
        }
        this.currentVolume = prevVolume;
    }


    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

}
