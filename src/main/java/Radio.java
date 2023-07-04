package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStation = 10;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int numberOfStation) {

        this.numberOfStation = numberOfStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > (numberOfStation - 1)) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void nextStation() {
        if (currentStation == (numberOfStation - 1)) {
            currentStation = 0;
            return;
        }
        currentStation++;
    }


    public void prevStation() {
        if (currentStation == 0) {
            currentStation = numberOfStation - 1;
            return;
        }
        currentStation--;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }


    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}