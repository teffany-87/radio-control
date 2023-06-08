package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < 0) {
            return;
        }
        if (CurrentStation > 9) {
            return;
        }
        this.currentStation = CurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 10) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void NextStation() {
        if (currentStation == 9) {
            currentStation = 0;
            return;
        }
        currentStation++;
    }


    public void PrevStation() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        currentStation--;
    }

    public void IncreaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }


    public void ReduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
